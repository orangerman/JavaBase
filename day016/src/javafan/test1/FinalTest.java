package javafan.test1;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 14:27
 */

/**
 * try - catch -final中final中的使用
 * <p>
 * 1.finally时可选的
 * 2.finally中声明的一定是会被执行的代码。即使catch中出现了异常，try中有return语句，也一定会被执行
 */
public class FinalTest {
    //test1

    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("我好帅");
        }
    }


    //test2  即使中间return 结束程序但结束之前也会执行finally的语句
    public int method() {
        try {


            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("一定会被执行");
        }
    }
}