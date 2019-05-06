package javafan.exer;

/**
 * @author java_fan
 * @create 2019-05-04 16:10
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a1 =  new Account();
        Account a2 = new Account("199612",100.0);

        Account.setInterestRate(0.05);
        Account.setMiniBalance(100);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a2.getBalance());
        System.out.println(Account.getInterestRate());
    }
}
