package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-02 20:25
 */
public class Car {
    private String colour;
    private int id;

    public Car() {

    }

    public Car(String colour, int id) {
        this.colour = colour;
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public int getId() {
        return id;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "汽车型号："+id + "汽车颜色：" + colour;
    }


}
