package team.domain;

/**
 * @author java_fan
 * @description
 * @create 2019-05-09 15:52
 */
public class NoteBook implements Equiment {
    private String model;
    private double price;

    public NoteBook() {

    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + "）";
    }
}
