package team.domain;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 16:20
 */
public class Archhitect extends Designer {
    private int stock;

    public Archhitect() {

    }

    public Archhitect(int id, String name, int age, double salary, Equiment equiment, int bonus, int stock) {
        super(id, name, age, salary, equiment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetils()+"\t架构师\t"+getStatus()+"\t"+stock+"\t"+getEquiment().getDescription();
    }
}
