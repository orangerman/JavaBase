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
    private double bonus;


   public Designer(){

   }

    public Designer(int id, String name, int age, double salary, Equiment equiment, double bonus) {
        super(id, name, age, salary, equiment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
