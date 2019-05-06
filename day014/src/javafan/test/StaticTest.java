package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-04 14:37
 */

/**
 * static 关键字的使用
 * 1.静态的
 * 2.static可以用来修饰：属性，方法，代码块（初始化块），内部类
 * <p>
 * 3.使用static修饰属性：静态变量（类变量）
 * 3.1属性是否使用static修饰，又分为：静态属性  vs 非静态属性（实例变量）
 * 实例变量：我们创建了类的多个变量，每个变量都独立拥有一套类中的非静态属性。当修改其中一个对象中的
 * 非静态属性时，不会导致其他对象中同样属性的修改。
 * 静态变量：我们创建了类的多个对象，多个对象共享同一个变量，当通过某一个对象修改静态变量时，会导致其他对象调用静态变量时，
 * 显示的时修改之后的值。
 * 3.2 其他说明：①  静态变量（类变量）随着类的加载而加载,可以通过“类。静态变量”
 *             ②  静态变量加载要早于对象的创建。
 *            ③   由于类只会加载一次，则静态变量再内存中也只会存在一份，存在于方法区的静态域中，所有对象都共享这一份
 * <p>
 * <p>
 * ④   类变量              实例变量
 * 类    yes                no
 * 对象   yes                yes
 * <p>
 * 3.3 静态属性举例：System.out, Math.PI 直接通过类来调用。
 * <p>
 * 4.使用static修饰方法：静态方法
 * ①：随着类的加载而加载，可以通过“类.方法"调用
 * ②       静态方法          非静态方法
 * * 类    yes                 no
 * * 对象   yes                yes
 * <p>
 * ③：静态方法中只能调用静态的方法或者属性
 * 非静态方法中，既可以调用非静态属性和方法或者静态属性和方法
 * <p>
 * 5.static的注意点
 * ⑤：在静态的方法内不能使用this和super关键字
 * ⑥ 按照其生命周期来判断能不能使用
 * <p>
 * 6.开发中，如何确定一个属性是否要声明为static的？
 * 属性是可以被多个对象所共享的，不会随着对象的不同而不同
 * <p>
 * <p>
 * 开发中，如何判断一个方法是否要声明为static的？
 * 操作静态属性的方法，通常设置为static
 * 工具类中的方法，习惯上声明为static的。比如：Math.Arrays,
 */
public class StaticTest {

    public static void main(String[] args) {
        Chinese.nation = "CHINA";
        Chinese c1 = new Chinese();
        c1.age = 18;
        c1.name = "范志强";
//        c1.nation = "CHINA";

        Chinese c2 = new Chinese();
        c2.name = "王伟民";
        c2.age = 17;

//        System.out.println(c2.nation);
//中国人吃中餐
        Chinese.eat();

    }
}

class Chinese {

    String name;
    int age;
    static String nation;

    public static void eat() {
        System.out.println("中国人吃中餐");
//        show();
//        name = "TOm";
        //可以调用静态的属性，
        System.out.println(Chinese.nation);
        //可以调用静态方法
        walk();

    }

    public void show() {

        System.out.println("中国人");
        info();
        eat();
    }


    public static void walk() {

    }

    public void info() {
        System.out.println("name:" + name + ",age:" + age);
    }
}
