package javafan.test4;

/**
 * @author java_fan
 * @create 2019-05-05 9:53
 */

/**
 *  5.对属性可以赋值的位置
 *  *   ① 默认初始化
 *  *   ② 显式初始化  ⑤ 代码块中进行初始化
 *  *   ③ 构造器中初始化
 *  *   ④ 有了对象之后，对象。属性和对象。方法可以进行赋值
 *  *
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);  //4
    }

}
class Order{
    int orderId = 3;

    {
        orderId = 4;
    }
}