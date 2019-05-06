package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-05 14:11
 */

/**
 * abstract关键字的使用:修饰的结构：类、方法
 *
 * 修饰类：抽象类   ①不能实例化  ② 抽线类中一定有构造器 ③ 开发中都会提供抽象类的子类，来创建对象。
 *
 *
 * 修饰方法：没有方法体
 *          包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法
 *          若子类重写了父类中(所有父类)的所有抽象方法后，此子类方可实例化
 *          若没有全部重写。则子类必须也是抽象类
 *
 *
 */
public class AbstractTest {
    public static void main(String[] args) {
//        Person p = new Person();  一旦抽象了就不能实例化
        Student s1 = new Student("范志强",17);
        s1.eat();

    }
}


abstract  class Creature{
    public abstract void breath();


}
abstract   class Person extends Creature{

    String name ;
    int age;


    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//抽象方法
    public abstract void eat();

    public void sleep(){
        System.out.println("人睡觉");
    }
}
class Student extends Person{


    public Student(){}
    public Student(String name,int age){
        super( name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃好的");
    }

    @Override
    public void breath() {
        System.out.println("呼吸");
    }


}
