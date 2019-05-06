package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-02 21:26
 */
public class GeneralStaff extends Employee{


    public GeneralStaff() {
    }

    public GeneralStaff(String name, String id, int salary) {
        super(name, id, salary);
    }

    @Override
    public double bonus( ) {
        return super.bonus()*1.5;
    }
}
