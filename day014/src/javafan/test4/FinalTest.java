package javafan.test4;

/**
 * @author java_fan
 * @create 2019-05-05 9:57
 */

/**
 * final:最终的
 * <p>
 * 1.final可以用来修饰的结构：类、方法、变量
 * <p>
 * 2.final 用来修饰一个类
 * 比如：String 类、System类、StringBuffer类
 * 3.  final 用来修饰一个方法：
 * 此方法不能被重写
 * 比如：Object类中的getclass().
 * 4.  final 用来修饰一个变量：此时的“变量”就变成常量
 * <p>
 * 4.1 修饰属性： 直接变成常量，可以考虑赋值的位置有:显式初始化、代码块中初始化、构造器
 *     修饰局部变量：
 *        尤其时修饰形参时，表明此形参是个常量，当我们调用此方法时，赋值既可以，在方法体内使用，不能对此形参进行修改
 *
 * 5.static final ：用来修饰属性：全局常量
 *                  修饰方法：随着类加载而加载，不能被重写
 */
public class FinalTest {
    //width不能被修改
    final int width = 10;
    final int LEFT;
    final int RIGHT;


    {
        LEFT = 1;
    }

    public FinalTest(int n) {
        RIGHT = n;
    }
    //    public void setWidth(){
//        width = 20;
//    }
//


    public static void main(String[] args) {
        int num = 10;
        num += 5;
    }

}
final class FinalA {
//最后类，不能被继承
}

//class FinalB extends FinalA{
//
//}
class AA {
    public final void show() {

    }
}

//class BB extends AA{
//    @Override
//    public void show() {
//
//    }
//}
