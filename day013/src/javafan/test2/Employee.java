package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-02 21:14
 */

/**
 * 定义员工类Employee，包含姓名、工号和工资，包含计算奖金方法bonus，
 * 普通员工和经理都是员工，计算奖金的方法为工资*奖金系数，普通员工的奖金系数为1.5（常量），
 * 经理为2（常量），分别实现bonus方法，创建对象测试。
 */
public class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee() {

    }

    public Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public double bonus() {
        return salary;

    }
}
