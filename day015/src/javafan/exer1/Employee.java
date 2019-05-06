package javafan.exer1;

/**
 * @author java_fan
 * @create 2019-05-05 15:58
 */
public abstract class Employee {
    private String name;
    private  double   num;
    private MyDate birthday;

    public Employee(){}

    public Employee(String name, double num, MyDate birthday) {
        this.name = name;
        this.num = num;
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", birthday=" + birthday.toDateString() +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getNum() {
        return num;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
