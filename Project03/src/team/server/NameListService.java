package team.server;

import team.domain.*;

/**
 * @author java_fan
 * ?@description
 * @create 2019-05-09 16:22
 */
public class NameListService {
    private Employee[] employees;

    /**
     * 给数组及数组元素赋值
     *
     * @param employees
     */
    public NameListService(Employee[] employees) {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);

            //获取employee的4个基本信息

            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            Equiment equiment;
            double bonus;
            int stock;
            switch (type) {
                case Data.EMPLOYEE:

                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equiment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equiment);
                case Data.ARCHITECT:
                    equiment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);

                    employees[i] = new Archhitect(id, name, age, salary, equiment, bonus, stock);
                    break;
                case Data.DESIGNER:
                    equiment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equiment, bonus);
                    break;
                default:
                    break;
            }
        }

    }

    /**
     * 获取指定位置上员工的设备
     *
     * @param index
     * @return
     */
    private Equiment createEquipment(int index) {
        int type = Integer.parseInt(Data.EQIPMENTS[index][0]);
        switch (type) {
            case Data.PC:
                String model = Data.EQIPMENTS[index][1];
                String display = Data.EQIPMENTS[index][2];
                return new PC(model, display);


            case Data.NOTEBOOK:
                String model1 = Data.EQIPMENTS[index][1];
                double price = Double.parseDouble(Data.EQIPMENTS[index][2]);
                return new NoteBook(model1, price);

            case Data.PRINTER:
                String name = Data.EQIPMENTS[index][1];
                String type1 = Data.EQIPMENTS[index][2];
                return new Printer(name, type1);

            default:
                return null;

        }
    }

    public Employee[] getAllEmployees() {
        return null;
    }
}
