package javafan.exer;

/**
 * @author java_fan
 * @create 2019-05-04 16:00
 */

/**
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密编写一个类实现银行账户的概念，
 * 包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法
 * 编写主类，使用银行账户类，输入、输出3个客户的信息
 */
public class Account {
    private int id;
    private String pwd = "000000";
    private double balance;

    private static double interestRate ;
    private static double miniBalance = 1.0;
    //用于自动生成id
    private static int init = 1001;

    public Account(){
        id = init++;
    }
    public Account(String pwd,double balance){
        id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static double getMiniBalance() {
        return miniBalance;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static void setMiniBalance(double miniBalance) {
        Account.miniBalance = miniBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
