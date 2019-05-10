//package team.test;
//
//import team.domain.Employee;
//import team.server.NameListService;
//import team.server.TeamException;
//
///**
// * @author java_fan
// * @description
// * @create 2019-05-10 11:00
// */
//public class NameListServiceTest {
//    public static void main(String[] args) {
//        NameListService nameListService = new NameListService();
//        Employee[] employees = nameListService.getAllEmployees();
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i].toString());
//        }
//        System.out.println("*****************");
//        try {
//            Employee employee = nameListService.getEmployee(15);
//            System.out.println(employee.toString());
//        } catch (TeamException e) {
//            System.out.println(e.getMessage());;
//        }
//
//
//    }
//}
