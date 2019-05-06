package Jdk8;

/**
 * @author java_fan
 * @create 2019-05-06 14:26
 */
public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.method2();
        s.method3();
        //跟system.out相似
        CompareA.method1();
        s.method2();
        //若实现类重写了接口中的默认方法，则通过对象调用，调用的是重写的方法
        //method1:
        //知识点一 接口中定义的静态方法只能通过接口来调用
//        s.method3(); 默认调用的是父类中的方法   ---类优先原则
        //在实现类的方法中调用父类、接口中的方法  接口名。super。方法名

    }
}
class SubClass extends SuperClass implements CompareA{
    @Override
    public void method2() {
        System.out.println("重写");
    }

    public void myMethod(){
        method3();
        super.method3();
        CompareA.super.method2();//调用接口中的默认方法     接口名。super。方法名
    }
}
