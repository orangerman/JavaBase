package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-04 17:45
 */
public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0 ; i < args.length; i++){
            System.out.println("*********" + args[i]);
            //String 转化为int
            int num =Integer.parseInt(args[i]);
            System.out.println("#######" + num);
        }
    }
}
