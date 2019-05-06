package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-03 17:44
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){

    }
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return  0.0;
    }
}

