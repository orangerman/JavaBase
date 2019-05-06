package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-05 15:27
 */

/**
 * 抽象类的匿名子类 抽象父类不能实例化，则先可以用父类然后再在后面重写方法
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student()); //匿名对象
//        Person p = new Person() {
//            @Override
//            public void eat() {
//                System.out.println("吃饭");
// 匿名子类的对象         }
//
//            @Override
//            public void breath() {
//
//                System.out.println("呼吸'");
//            }
//        };


    }

    public static void method(Student student) {

    }
}
