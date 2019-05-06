package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-04 16:49
 */

/**
 * 区分饿汉式和懒汉式
 *       饿汉式：对象加载时间长（坏处）  天然线程安全（好处）
 *       懒汉式：延迟对象的创建（好处）
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order = Order.getInstance();
        Order order1 =Order.getInstance();
        System.out.println(order == order1);
    }
}


//懒汉式单例模式
class Order {

    //1.私有化类的构造器
    private Order() {

    }

    //2.先声明当前类的对象，没有初始化
    //4.此对象也必须声明为static的
    private static Order instance = null;

    //3.s声明public static的返回当前类对下个的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
            return instance;
        } else {
            return instance;
        }
    }
}