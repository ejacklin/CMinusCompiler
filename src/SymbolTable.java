import java.util.HashMap;
import java.util.Set;

/**
 * Created by Erin on 4/9/2018.
 */
public class SymbolTable {
    private HashMap<String,Object> symbolTable;

    public Set<String> GetKeys(){
        return symbolTable.keySet();
    }

    public void Add(String key, Object token){
        if(!symbolTable.containsKey(key)){
            symbolTable.put(key, token);
        }
    }

    public boolean IsInTable(String key){
        return symbolTable.containsKey(key);
    }

}
