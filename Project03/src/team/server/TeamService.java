package team.server;

import team.domain.Archhitect;
import team.domain.Designer;
import team.domain.Employee;
import team.domain.Programmer;

/**
 * @author java_fan
 * @description 关于开发团队成员的管理：添加、删除
 * @create 2019-05-10 11:59
 */
public class TeamService {
    /**
     * 生成静态TID
     * 限制开发团队成员的人数
     */
    private static int counter = 1;

    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public TeamService() {

    }

    /**
     * 获取全部开发团队成员
     *
     * @return
     */
    public Programmer[] getTeam() {
        Programmer[] p = new Programmer[total];
        for (int i = 0; i < p.length; i++) {
            p[i] = team[i];
        }
        return p;
    }

    /**
     * 将指定的员工添加到开发团队中
     *
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发成员，无法添加");

        }
        if (isExist(e)) {
            throw new TeamException("该成员已在本开发团队，无法添加");
        }
        if (((Programmer) e).getStatus().getNAME().equals("BUSY")) {
            throw new TeamException("该成员已经是某团队的成员，无法添加");

        } else if (((Programmer) e).getStatus().getNAME().equals("VOCATION")) {
            throw new TeamException("该成员正在休假，无法添加");
        }
        //获取team已有成员中架构师、设计师、程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Archhitect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else {
                numOfPro++;
            }
        }


        //错误的写法
//        if (e instanceof Archhitect && numOfArch >= 1) {
//            throw new TeamException("团队中至多只有一名架构师");
//        } else if (e instanceof Designer && numOfDes >= 2) {
//            throw new TeamException("团队中至多只能有两名设计师");
//        } else if (e instanceof Programmer && numOfPro >= 3) {
//            throw new TeamException("团队中至多只能有三名程序员");
//        }
        if (e instanceof Archhitect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只有一名架构师");
            }
        } else if (e instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (e instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //将e添加至原有的team
        team[total++] = (Programmer) e;
        ((Programmer) e).setStatus(Status.BUSY);
        ((Programmer) e).setMemberId(counter++);


    }

    /**
     * 判断指定的员工是否已经存在原有的开发团队
     *
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }

        }
        return false;
    }

    /**
     * 从团队中删除成员
     *
     * @param memberID
     */
    public void removeMember(int memberID) throws TeamException {
        int i = 0;

        for (; i < total; i++) {
            if (team[i].getMemberId() == memberID) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        //未找到
        if (i == total) {
            throw new TeamException("找不到指定位置的员工，删除失败");
        }
        //删除一个成员，后面的前移
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        //最后一个元素置空
        team[--total] = null;

    }


}
