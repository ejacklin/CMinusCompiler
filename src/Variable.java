import java.util.ArrayList;

/**
 * Created by Erin on 4/9/2018.
 */
public class Variable {

    public String name;
    public Integer value;
    public ArrayList<Integer> aValue;
    public Boolean param;
    public Boolean array;
    public String type;

    public Variable(String name, String type, Integer value, Boolean param) {
        this.name = name;
        this.value = value;
        this.param = param;
        this.type = type;
    }

    public Variable(String name, String type, Boolean param) {
        this.name = name;
        this.param = param;
        this.type = type;
    }

    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
        this.param = false;
    }

    public boolean IsParameter(){
        return this.param;
    }

    public Integer GetValue(){
        return this.value;
    }

    public ArrayList<Integer> GetArrayValue(){
        return this.aValue;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", param=" + param +
                ", returnType='" + type + '\'' +
                '}';
    }
}
