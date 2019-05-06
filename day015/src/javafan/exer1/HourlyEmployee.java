package javafan.exer1;

/**
 * @author java_fan
 * @create 2019-05-05 16:16
 */
public class HourlyEmployee extends Employee{
    private int wage;
    private int hour;


    public HourlyEmployee(String name, double num, MyDate birthday) {
        super(name, num, birthday);
    }

    public HourlyEmployee(int wage, int hour) {
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, double num, MyDate birthday, int wage, int hour) {
        super(name, num, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [" + super.toString() + "]";
    }
}
