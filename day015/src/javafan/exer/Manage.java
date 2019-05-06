package javafan.exer;

/**
 * @author java_fan
 * @create 2019-05-05 15:18
 */
public class Manage extends Employee {
    private double bonus;

    public Manage(double bonus) {
        this.bonus = bonus;
    }

    public Manage(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提高公司运行效率");
    }
}

