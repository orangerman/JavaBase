package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-03 17:44
 */
public class Circle extends GeometricObject{
    //半径
    private double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public Circle(String color, double weight, double raduis) {
        super(color, weight);
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double findArea() {
        double area= Math.PI *raduis*raduis;
        return area;
    }
}
