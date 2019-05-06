package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-04 16:41
 */

/**
 * 1.采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例
 * <p>
 * 2.如何实现
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
//true  相同
        System.out.println(bank1 == bank2);
    }
}

/**
 * 单例模式的饿汉式实现
 */
class Bank {


    //1.私有化构造器
    private Bank() {

    }

    //2.内部创建类的对象
    private static Bank instance = new Bank();


    //3.提供公共的方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }

}
