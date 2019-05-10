package team.view;

import team.domain.Employee;
import team.domain.Programmer;
import team.server.NameListService;
import team.server.TeamService;

/**
 * @author java_fan
 * @description
 * @create 2019-05-10 16:36
 */
public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();


    public void enterMainMemu() {
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {
            if (menu != '1') {
                listAllEmployees();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addTeam();
                    break;
                case '3':
                    deleteTeam();
                    break;
                case '4':
                    System.out.println("请确认是否退出: (Y/N)");
                    char f = TSUtility.readConfirmSelection();
                    if (f == 'Y') {
                        loopFlag = false;
                    } else {
                        break;
                    }

                default:

            }
        }
    }

    /**
     * 显式所有员工信息
     */
    private void listAllEmployees() {
//        System.out.println("显式所有员工信息");
        System.out.println("*************************开发团队调度软件************************\n");
        Employee[] employees = listSvc.getAllEmployees();
        System.out.println("ID\t姓名\t\t年龄\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println("**************************************************************\n");


    }

    private void getTeam() {
//        System.out.println("查看开发团队情况");
        System.out.println("************************团队成员列表****************************\n");
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("开发团队目前没有人");
        } else {
            System.out.println("TID/ID 姓名  年龄 工资 职位 奖金 股票\n");
            for (int i = 0;i < team.length;i ++){
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("**************************************************************\n");

    }

    private void addTeam() {
        System.out.println("添加团队成员");
    }

    private void deleteTeam() {
        System.out.println("删除团队成员");
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMemu();
    }

}
