import java.util.HashMap;
import java.util.Set;

/**
 * Created by Erin on 4/9/2018.
 */
public class SymbolTable {
    private HashMap<String,Object> symbolTable;

    @Override
    public String toString() {
        String outString = "";
        for (String k : symbolTable.keySet()){
            outString += k + ": " + symbolTable.get(k).toString() + "\n";
        }
        return outString;
    }

    public SymbolTable() {
        this.symbolTable = new HashMap<>();
    }

    public Set<String> GetKeys(){
        return symbolTable.keySet();
    }

    public void Add(String key, Object token){
        if(!symbolTable.containsKey(key)){
            symbolTable.put(key, token);
        }
    }

    public boolean Contains(String key){
        return symbolTable.containsKey(key);
    }

}
