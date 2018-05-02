/**
 * Created by Erin on 4/22/2018.
 */

import org.bytedeco.javacpp.*;

import java.util.*;

import static org.bytedeco.javacpp.LLVM.*;

public class CodeGen {

    public static LinkedHashMap<String,Function> functions = new LinkedHashMap<>();
    public static LLVMModuleRef module;
    public CodeGen() {
    }

    void GenerateIRCode(SymbolTable symbolTable){

        BytePointer error = new BytePointer((Pointer)null); // Used to retrieve messages from functions
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();


        module = LLVMModuleCreateWithName("gcd_module");

    }

    private void AddFunction(Function function, LLVMModuleRef module){
        ArrayList<LLVMTypeRef> args = new ArrayList<>();
        ArrayList<LLVMTypeRef> variables = new ArrayList<>();
        ArrayList<String> argNames = new ArrayList<>();
        ArrayList<String> variableNames = new ArrayList<>();


        String name = function.name;
        String returnType = function.returnType;
        HashMap<String, Object> symTable = function.symbolTable.symbolTable;
        Set<String> keys = symTable.keySet();

        //determine function return type
        LLVMTypeRef retType;
        if(returnType.equalsIgnoreCase("int")){
            retType = LLVMInt32Type();
        }else{
            retType = LLVMVoidType();
        }

        //determine args
        for (String key : keys){
            Object obj = symTable.get(key);
            if(obj instanceof Variable){
                Variable var = (Variable) obj;
                if(var.IsParameter()){
                    argNames.add(var.name);
                    args.add((var.type.equalsIgnoreCase("int") ? LLVMInt32Type() : LLVMVoidType()));
                }else{
                    variableNames.add(var.name);
                    variables.add((var.type.equalsIgnoreCase("int") ? LLVMInt32Type() : LLVMVoidType()));
                }
            }

        }

        LLVMTypeRef arr[] = (LLVMTypeRef[]) args.toArray();
        LLVMTypeRef param[] = (LLVMTypeRef[]) variables.toArray();
        LLVMTypeRef ret_type = LLVMFunctionType(retType, arr[0], args.size(), 0);
        LLVMValueRef funct = LLVMAddFunction(module, name, ret_type);

        LLVMSetFunctionCallConv(funct, LLVMCCallConv);
        LLVMValueRef n = LLVMGetParam(funct, param[0]);

        LLVMBasicBlockRef entry = LLVMAppendBasicBlock(funct, "entry");
        LLVMBuilderRef builder = LLVMCreateBuilder();
        LLVMPositionBuilderAtEnd(builder, entry);

    }

    public static void main(String[] args) {
        SymbolTable symbolTable = new SymbolTable();
        Function function = new Function("Testing","int");
        Variable a = new Variable("a","int", 12, true);
        Variable b = new Variable("b","int", 15, false);
        function.symbolTable.Add(a.name,a);
        function.symbolTable.Add(b.name,b);
        symbolTable.Add(function.name,function);

        CodeGen codeGen = new CodeGen();
        codeGen.GenerateIRCode(symbolTable);
    }
}
