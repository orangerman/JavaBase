package javafan.test1;

/**
 * @author java_fan
 * @description
 * @create 2019-05-08 21:48
 */

/**
 * 异常的处理：抓抛模型
 *
 * 过程一：在正常的执行过程中，一旦出现异常，就会在异常代码处，生成一个对应异常类的对象，并将对象抛出
 *       其后的代码就不再执行
 * 过程二：异常的处理方式
 *
 * 1.try-catch-finally
 * try {
 *
 *     //可能出现异常的代码
 * }catch（异常类型1 变量名1）{
 *     //处理异常的方式1
 * }catch（异常类型2 变量名2）{
 *     //处理异常的方式
 * }
 * 。。。。
 *
 * final{
 *
 *     //一定会执行的代码5
 * }
 *注：final是可选的
 *   使用try将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就生成一个对应异常类的对象，根据此对象去匹配catch
 *   一旦匹配上catch，就进入异常处理过程，一旦处理完成就直接跳出try catch结构
 *   catch类型有子父类关系 子类必须要在上面不然就会报错
 *   catch没有子父类关系就随便放
 *
 *   常用异常对象处理的方式： 1 String getMessage  2.printStackTrace()  即打印
 *   6.在try声明的变量，在出来try之后不能使用。
 *   7.try -catch结构可以相互嵌套
 *
 *   体会：使用try-catch-final处理编译时异常，使得程序在编译时不再出错，但在运行时还有出错，延迟错误
 *
 *   想数据库的连接、输入输出六、网络编程socket等资源、jvm是不能自动回收的、我们需要手动进行资源的回收  要放在异常之间
 */
public class ExceptionTest1 {
    public static void main(String[] args) {


    String str = "abc";

    try{
        int num = Integer.parseInt(str);
        System.out.println("hello 1");
    }catch(NumberFormatException e)
    {
        System.out.println("出现了数值转换异常，不要着急");

    }
    catch (NullPointerException e){
        System.out.println("空指针异常");
        e.printStackTrace();
    }
        System.out.println("hello 2");

}
}



