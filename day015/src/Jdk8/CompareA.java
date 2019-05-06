package Jdk8;

/**
 * @author java_fan
 * @create 2019-05-06 14:24
 */

/**
 * 以前只能 全局变量和抽象方法
 * 现在可以静态方法和默认方法
 */
public interface CompareA {
    //静态ff
    public static void method1(){
        System.out.println("北京");
    }
    //默认方法
    public default  void method2(){
        System.out.println("上海");
    }
    default  void method3(){
        System.out.println("南京");
    }
}
