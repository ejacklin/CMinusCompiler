/**
 * Created by Erin on 4/9/2018.
 */
public class Function {

    private String name;
    private String type;
    private SymbolTable symbolTable;

    public Function(String name, String type) {
        this.name = name;
        this.type = type;
        this.symbolTable = new SymbolTable();
    }


}
