package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-03 17:45
 */
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        GeometricObject o1 = new Circle(1.5);
        GeometricObject o2 = new MyRectangle(2, 5);

        System.out.println(test.equalsArea(o1, o2));
        test.diplayGeomertricObject(o1);
        test.diplayGeomertricObject(o2);
    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
        return o1.findArea() == o2.findArea();
    }

    public void diplayGeomertricObject(GeometricObject o) {
        System.out.println("面积为" + o.findArea());
    }
}
