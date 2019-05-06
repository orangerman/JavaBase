package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-02 17:55
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("吃草");
    }

    public void jiao() {
        System.out.println("喵喵喵");
    }
}
