package team.domain;

import team.server.Status;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 16:04
 */
public class Programmer extends Employee {

    private int memberId;
    private Status status = Status.FREE;
    private Equiment equiment;

    public Programmer() {

    }


    public Programmer(int id, String name, int age, double salary,  Equiment equiment) {
        super(id, name, age, salary);

        this.equiment = equiment;
    }

    public int getMemberId() {
        return memberId;
    }

    public Status getStatus() {
        return status;
    }

    public Equiment getEquiment() {
        return equiment;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEquiment(Equiment equiment) {
        this.equiment = equiment;
    }

    @Override
    public String toString() {

        return super.toString() + "\t程序员\t" + status + "\t\t\t" + equiment.getDescription();
    }
}
