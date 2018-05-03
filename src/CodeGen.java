/**
 * Created by Erin on 4/22/2018.
 */

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.Cast;
import com.ejacklin.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

import static org.bytedeco.javacpp.LLVM.*;

public class CodeGen {

    public static LinkedHashMap<String,Function> funcTable = new LinkedHashMap<>();
    public static LLVMModuleRef module;
    public static HashMap<String, Object> symTable;

    public CodeGen() {
    }

    void GenerateIRCode(SymbolTable symbolTable, AST ast){
        symTable = symbolTable.symbolTable;
        BytePointer error = new BytePointer((Pointer)null); // Used to retrieve messages from functions
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();


        module = LLVMModuleCreateWithName("gcd_module");

        for (String symbol : symbolTable.GetKeys()){
            Object o = symTable.get(symbol);
            if(o instanceof Function){
                AddFunction((Function) o);
            }
        }
        WalkAst(ast);

    }

    private void AddFunction(Function function){
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

        LLVMBasicBlockRef entry = LLVMAppendBasicBlock(funct, "entry");
        LLVMBuilderRef builder = LLVMCreateBuilder();

        for(int i = 0; i < variables.size(); i++){
            funcVarTable
        }
        LLVMValueRef LLVMBuildAlloca(LLVM.LLVMBuilderRef var0, LLVMTypeRef var1, @Cast({"const char*"}) BytePointer var2);
        LLVMPositionBuilderAtEnd(builder, entry);

    }

    public void WalkAst(AST ast, ){
        if(ast.getPayload() instanceof String){
            if(ast.payload.toString().contains("fun_declaration")){
                String funcName = "";
                for (AST child : ast.getChildren()){
                    if(child.getChildren().size() == 0){
                        if(!(child.payload.toString() instanceof String)){
                            Token token = (Token)child.payload;
                            if(token.getType() == 31){
                                funcName = token.getText();
                                llvmFunc = funcTable.get(funcName);
                            }
                        }
                    }
                }
            }
        }

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
