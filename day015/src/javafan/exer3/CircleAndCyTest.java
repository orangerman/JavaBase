package javafan.exer3;

/**
 * @author java_fan
 * @create 2019-05-06 22:27
 */

/**
 * day015课后练习题000
 * 我爱你
 */
public class CircleAndCyTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(4);
        System.out.println("面积是："+c1.area()+",周长为：" + c1.perimeter());
        System.out.println("面积是："+c2.area()+",周长为：" + c2.perimeter());

        Cylinder cy1 = new Cylinder(1,1);
        Cylinder cy2 = new Cylinder(2,2);
        System.out.println("表面积是：" + cy1.area()+",体积为" + cy1.volume());
        System.out.println("表面积是：" + cy2.area()+",体积为" + cy2.volume());
    }
}
