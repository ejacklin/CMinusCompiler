/**
 * Created by Erin on 4/9/2018.
 */
public class Function {

    public String name;
    public String returnType = null;
    public SymbolTable symbolTable;
    public boolean extern;

    public Function(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
        this.symbolTable = new SymbolTable();
    }

    public Function(String name, String returnType, Boolean extern) {
        this.name = name;
        this.returnType = returnType;
        this.symbolTable = new SymbolTable();
        this.extern = extern;
    }

    public boolean isExtern(){return this.extern;}

    boolean exists(String key){
        return symbolTable.Contains(key);
    }

    void insert(String key, Object object){
        symbolTable.Add(key, object);
    }


    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                ", returnType='" + returnType + '\'' +
                ", symbolTable=" + symbolTable +
                '}';
    }
}
