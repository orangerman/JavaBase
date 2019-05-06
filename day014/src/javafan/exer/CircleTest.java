package javafan.exer;

/**
 * @author java_fan
 * @create 2019-05-04 15:48
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println("创建圆的个数："  +Circle.getTotal() );
        Circle c3 = new Circle(2.5);
        System.out.println("创建圆的个数："  + Circle.getTotal());
        System.out.println(c3.getId());
    }
}

class Circle {

    private double radius;
    private int id;
    //创建圆的属性
    private static int total;
    // static声明的属性被所有对象所共享
    private static int init = 1001;


    public Circle() {
        id = init++;
        total++;
    }
    public Circle(double radius){
        this.radius = radius;
        id = init++;
        total++;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public static int getInit() {
        return init;
    }
}
