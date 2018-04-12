/**
 * Created by Erin on 4/9/2018.
 */
public class Variable {

    public String name;
    public Integer value;
    public Boolean param;
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
    }


    @Override
    public String toString() {
        return "Variable{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", param=" + param +
                ", type='" + type + '\'' +
                '}';
    }
}
