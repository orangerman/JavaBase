package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-04 17:55
 */

/**
 * 类的成员之四：代码块（初始化块）
 *
 *
 * 1.代码块的作用：初始化当前的类或者和对象  只能用static
 * 2.分类：静态代码块     vs   非静态代码块
 *
 *
 * 3.静态代码块：
 *   3.1 内部可以呦输出语句
 *   3.2 随着类的加载而执行,而且只执行一次
 *   3.3 初始化类的信息
 *   3.4 如果一个类中定义了多个静态代码块，则按照先后顺序执行  -->直接合成一个
     4.5 静态代码块的执行要优先于非静态代码块
 *
 * 4.非静态代码块:
 *   4.1 随着对象的创建而执行
 *   4.2 没创建一个对象就执行一次非静态初始化块
 *   4.3 作用：可以在创建对象时对对象的属性进行初始化
 *   4.4
 *
 *
 *
 *
 *
 *   总结：静态的只能调用静态的
 *        非静态的都能调用
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        //我是一个爱学习的人
        System.out.println(desc);
        //创建了一个对象，非静态代码块执行了
//        Person  p = new Person();
//        Person.show();

    }
}

class Person {
    String name;
    int age;
    static String desc = "我是一个人";

    public Person() {
        System.out.println("非静态初始化块");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 代码块
     * @return
     */
    {



    }

    static{

        System.out.println("static 初始化块");
        desc = "我是一个爱学习的人";
    }
    static{
        System.out.println("static 初始化块二");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(){
        System.out.println("吃饭");
    }
    public static void show(){
        System.out.println("静态方法");
    }
}
