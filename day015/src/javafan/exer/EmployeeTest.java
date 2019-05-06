package javafan.exer;

/**
 * @author java_fan
 * @create 2019-05-05 15:21
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //多态
        Employee manage = new Manage("库克",1001,5000,1000);
        manage.work();
        CommandEmployee commandEmployee = new CommandEmployee();
        commandEmployee.work();
    }
}
