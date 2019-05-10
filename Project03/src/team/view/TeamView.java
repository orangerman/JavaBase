package team.view;

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
        while (loopFlag) {
            listAllEmployees();
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）：");
            char menu = TSUtility.readMenuSelection();
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
        System.out.println("显式所有员工信息");
    }

    private void getTeam() {
        System.out.println("查看开发团队情况");
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
