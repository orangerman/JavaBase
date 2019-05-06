package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-02 17:53
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃肉");
    }

    public void jiao() {
        System.out.println("汪汪汪");
    }
}
