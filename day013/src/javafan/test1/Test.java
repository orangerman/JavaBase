package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-02 21:02
 */
public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4,5);
        System.out.println(v1.toString());

        Car car = new Car(7,8,9);
        System.out.println(car.toString());

        Truck truck = new Truck(10,11,12);
        System.out.println(truck.toString());
    }
}
