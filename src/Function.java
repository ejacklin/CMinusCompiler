/**
 * Created by Erin on 4/9/2018.
 */
public class Function {

    public String name;
    public String returnType = null;
    public SymbolTable symbolTable;

    public Function(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
        this.symbolTable = new SymbolTable();
    }

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
