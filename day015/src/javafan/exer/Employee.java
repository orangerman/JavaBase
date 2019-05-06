package javafan.exer;

/**
 * @author java_fan
 * @create 2019-05-05 15:16
 */
public abstract class Employee {
    private String name;
    private  int id;
    private double salary;
    public Employee(){

    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();
}
