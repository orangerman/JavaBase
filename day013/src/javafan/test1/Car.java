package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-02 20:56
 */
public class Car extends Vehicle {
    private int loader;

    public Car(int loader) {
        this.loader = loader;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }
    @Override
    public String toString() {
        return super.toString() + "载人数：" + loader;
    }
}
