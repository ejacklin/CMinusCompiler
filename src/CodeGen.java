/**
 * Created by Erin on 4/22/2018.
 */

import org.bytedeco.javacpp.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.bytedeco.javacpp.LLVM.*;

public class CodeGen {

    public static LinkedHashMap<String,Function> functions = new LinkedHashMap<>();

    public CodeGen() {
    }

    void GenerateIRCode(SymbolTable symbolTable){

        BytePointer error = new BytePointer((Pointer)null); // Used to retrieve messages from functions
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();


        LLVMModuleRef module = LLVMModuleCreateWithName("gcd_module");





    }

    private void AddFunction(Function function, LLVMModuleRef module){
        String name = function.name;
        String returnType = function.returnType;
        HashMap<String, Object> symbolTable = function.symbolTable.symbolTable;

        //deteremine function return type
        LLVMTypeRef retType;
        if(returnType.equalsIgnoreCase("int")){
            retType = LLVMInt32Type();
        }else{
            retType = LLVMVoidType();
        }

        LLVMTypeRef[] args = { LLVMInt32Type(), LLVMInt32Type() };
        LLVMTypeRef ret_type = LLVMFunctionType(retType, args[0], 2, 0);
        LLVMValueRef fun = LLVMAddFunction(module, name, ret_type);
    }
}
