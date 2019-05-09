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
 * 1.try-catch-final
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
    }
        System.out.println("hello 2");

}
}



