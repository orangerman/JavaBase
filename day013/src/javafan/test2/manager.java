package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-02 21:22
 */
public class manager extends Employee{

    public manager() {
    }

    public manager(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public double bonus( ) {
        return super.bonus()*2;
    }
}
