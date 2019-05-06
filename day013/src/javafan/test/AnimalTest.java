package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-02 17:53
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        //参数里面要求的是Animal 但是new了dog类也可以，这就是多态性
        test.ok(new Dog());

    }

    public void ok(Animal animal) {
        animal.eat();
    }
}


class Animal {
    public void eat() {
        System.out.println("吃饭");
    }

}
