package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-02 20:57
 */
public class Truck extends Vehicle{
    private double payload;

    public Truck(double payload) {
        this.payload = payload;
    }

    public Truck(int wheels, double weight, double payload) {
        super(wheels, weight);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() + "载重量：" + payload;
    }
}
