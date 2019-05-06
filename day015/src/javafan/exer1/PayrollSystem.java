package javafan.exer1;

import java.util.Scanner;

/**
 * @author java_fan
 * @create 2019-05-05 16:22
 */
public class PayrollSystem {
    public static void main(String[] args) {
        //没有new对象 只是创建了一个em类型的数组
        Employee[] employees = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前月份");
        int month = scanner.nextInt();

        employees[0] = new SalariedEmployee("范志强", 1002, new MyDate(1997, 01, 12), 1200);
        employees[1] = new HourlyEmployee("王伟民", 1001, new MyDate(1994, 11, 04), 60, 240);


        for(int i = 0 ;i < employees.length;i ++){
            System.out.println(employees[i]);
            double salary = employees[i].earnings();
            System.out.println("月工资为" + salary);
            if(month == employees[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励一百元");


            }
        }
    }
}