package team.domain;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 16:14
 */
public class Designer extends Programmer {
    /**
     * 奖金
     */
    private int bonus;


   public Designer(){

   }

    public Designer(int id, String name, int age, double salary, Equiment equiment, int bonus) {
        super(id, name, age, salary, equiment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int  bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetils() + "\t设计师"+"\t"+ getStatus()+ "\t"+bonus+"\t\t\t"+getEquiment().getDescription();
    }
    @Override
    public String getDetailsForTeam(){
        return getMemberId()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"设计师"+"\t"+getBonus();
    }
}
