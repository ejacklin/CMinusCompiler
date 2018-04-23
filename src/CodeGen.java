/**
 * Created by Erin on 4/22/2018.
 */

import org.bytedeco.javacpp.*;
import static org.bytedeco.javacpp.LLVM.*;

public class CodeGen {

    public CodeGen() {
    }

    void GenerateCode(AST ast){

        BytePointer error = new BytePointer((Pointer)null); // Used to retrieve messages from functions
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();


        LLVMModuleRef module = LLVMModuleCreateWithName("gcd_module");

        LLVMTypeRef[] gcd_args = { LLVMInt32Type(), LLVMInt32Type() };
        LLVMTypeRef ret_type = LLVMFunctionType(LLVMInt32Type(), gcd_args[0], 2, 0);

        LLVMValueRef gcd = LLVMAddFunction(module, "gcd", ret_type);


    }
}
