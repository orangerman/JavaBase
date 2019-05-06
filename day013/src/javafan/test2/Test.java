package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-02 21:28
 */
public class Test {
    public static void main(String[] args) {
        manager manager = new manager("范志强","1001",500);
        GeneralStaff generalStaff = new GeneralStaff("王伟民","1002",400);

        System.out.println(manager.bonus());
        System.out.println(generalStaff.bonus());
    }

}
