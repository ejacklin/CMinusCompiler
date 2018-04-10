/**
 * Created by Erin on 4/9/2018.
 */
public class Variable {

    private String name;
    private Integer value;
    private Boolean param;
    private String type;

    public Variable(String name, Integer value, Boolean param, String type) {
        this.name = name;
        this.value = value;
        this.param = param;
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
