package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-08 14:08
 */

import java.util.Date;
import java.util.Scanner;

/**
 *常见的异常都有那些？举例说明
 */
public class ExceptionTest {
    //************以下是编译时异常*************
//    public void test7(){
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//
//        int data = fis.read();
//        while(data!= -1){
//            System.out.println((char)data);
//            data = fis.read();
//        }
//        fis.close();
//    }




    //*********以下是运行时异常*************
    //InputMismatchException 输入不是int就异常了

    public  void test5(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
    }



    //NUmberFormatException

    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);

    }



    //类型转换异常
    public void test3(){
        Object obj = new Date();
        String str = (String)obj;
    }


    //数组角标越界

    public void test2(){
        int[]  arr1 = new int[3];
        System.out.println(arr1[3]);
    }



    //nullPointException
    public void test1(){
        int[] arr = null;
        System.out.println(arr[0]);

        String str ="abc";
        str = null;
        System.out.println(str.charAt(0));

    }

}
