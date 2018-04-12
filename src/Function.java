/**
 * Created by Erin on 4/9/2018.
 */
public class Function {

    public String name;
    public String type;
    public SymbolTable symbolTable;

    public Function(String name, String type) {
        this.name = name;
        this.type = type;
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
                ", type='" + type + '\'' +
                ", symbolTable=" + symbolTable +
                '}';
    }
}
