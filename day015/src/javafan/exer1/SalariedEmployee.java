package javafan.exer1;

/**
 * @author java_fan
 * @create 2019-05-05 16:03
 */
public class SalariedEmployee extends Employee {

    //月工资
    private double monthlySalary;

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, double num, MyDate birthday) {
        super(name, num, birthday);
    }

    public SalariedEmployee(String name, double num, MyDate birthday, double monthlySalary) {
        super(name, num, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "monthlysalary[" + super.toString() + "]";
    }
}
