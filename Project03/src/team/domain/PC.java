package team.domain;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 15:49
 */
public class PC implements Equiment {
    private  String model;
    private String display;
    @Override
    public String getDescription() {
        return model+"(" + display + ")";
    }

    public PC(){

    }
    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }
}
