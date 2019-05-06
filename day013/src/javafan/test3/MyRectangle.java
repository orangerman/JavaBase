package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-03 17:45
 */
public class MyRectangle extends GeometricObject{
    //宽度
    private double width;
    //高度
    private double height;

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        double area = width * height;
        return area;
    }
}
