package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-02 20:54
 */
public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle() {

    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "车轮个数：" + wheels + "，车重：" + weight;
    }
}
