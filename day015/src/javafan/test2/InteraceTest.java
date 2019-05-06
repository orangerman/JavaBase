package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-05 17:36
 */

/**
 * interface
 * 1.java 是单继承性 不能直接拥有多个直接父类
 * 2.java语言中，类和接口是两个并列的结构
 * 3.如何定义接口：定义接口中的成员
 * <p>
 * 3.1 jdk7及以前：只能定义全局常量和抽象方法
 * 全局常量 public static final的 但可以直接省略不写 都还在
 * 抽象方法 public abstract
 * <p>
 * 3.2 jdk8：除了定义全局常量和抽象方法，还可以定义静态方法、默认方法
 * <p>
 * 4.接口中不能定义构造器！意味着接口不能实例化
 * <p>
 * 5.Java开发中，接口通过让类去实现去使用
 * <p>
 * 6.如果实现类覆盖了接口中所有抽象方法，则可以实现类的实例化
 * 如果没有对所有抽象方法进行覆盖，则该实现类只能是抽象类
 * <p>
 * 7.Java类可以实现多个接口 -- >弥补了单继承性的局限性
 * 格式：class A extends B implements C ，D
 * <p>
 * 8.接口和接口之间：
 * 多继承关系
 * 一个接口可以继承多个接口
 * <p>
 * 9.接口的具体的使用：可以体现多态性
 * <p>
 * 10.接口，实际上是一种规范
 */
public class InteraceTest {
    public static void main(String[] args) {
        System.out.println(Flyably.MAX_SPEED); //体现静态的
//        Flyably.MAX_SPEED = 1;       不能修改 体现final

        Plane p1 = new Plane();
        p1.fly();
//        Kite k1 = new Kite(); 抽象类不能实例化 要实例化全部抽象方法都的重写


    }
}

interface Accackable {
    void accack();
}

interface Flyably {

    //全局常量 -- >常量全大写
    int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    public abstract void fly();

    //可以省略public 和abstract
    void stop();


//    public Flyably(){
//
//    }

}

class Plane implements Flyably {
    @Override
    public void fly() {
        System.out.println("起飞");
    }

    @Override
    public void stop() {
        System.out.println("减速停止");
    }
}

abstract class Kite implements Flyably {
    @Override
    public void fly() {

    }
}

class Bullet implements Flyably, Accackable {
    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accack() {

    }
}
