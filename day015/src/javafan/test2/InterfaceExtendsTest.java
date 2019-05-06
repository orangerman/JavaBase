package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-06 12:43
 */
public class InterfaceExtendsTest {
    public static void main(String[] args) {
        test a1 = new test();
        a1.method1();
        a1.method2();
    }

}
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{
//拥有两个父接口的两个抽象方法
}


class test extends InterfaceExtendsTest implements CC{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

}