package javafan.exer3;

/**
 * @author java_fan
 * @create 2019-05-06 22:13
 */
public class Circle implements shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    public double perimeter() {
        return 2 * radius * PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
