package javafan.exer3;

/**
 * @author java_fan
 * @create 2019-05-06 22:21
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double area() {
        return super.perimeter()*height + 2*super.area();
    }
    public double volume(){
        return super.area()*height;
    }
}
