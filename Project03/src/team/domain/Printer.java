package team.domain;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 15:56
 */
public class Printer implements Equiment {
    private String name;
    private String type;


    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }

}
