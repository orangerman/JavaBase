package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-04 17:36
 */

/**
 * main（）方法的使用和说明
 * 1.main()作为程序的入口出现
 * 2.main()也是一个普通的静态方法
 * 3.main()方法可以作为我们与控制台交互的方式。（之前使用Scanner）
 */
public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[10]);
        MainTest.show();
    }
    //必须静态 才能在上面直接调用
    public static void show(){

    }
}
class Main{
    public static void main(String[] args) {
        args = new String[100];
        for(int i = 0;i < args.length;i++){
            args[i] = "args_"+ i;
            System.out.println(args[i]);
        }
    }
}
