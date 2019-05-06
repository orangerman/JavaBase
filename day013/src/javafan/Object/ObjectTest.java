package javafan.Object;

/**
 * @author java_fan
 * @create 2019-05-03 21:28
 */

/**
 * 1.object类是所有Java类的根父类
 * 2.如果在类的声明中没有extends明确指向，则默认object是其父类
 * 3.object类中方法就具有通用性
 *
 * 4.只声明一个空参构造器x
 */
public class ObjectTest {
    public static void main(String[] args) {
    Order order = new Order();
        //object87
        System.out.println(order.getClass().getSuperclass());
    }
}
class Order{

}
