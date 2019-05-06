package javafan.test;

/**
 * @author java_fan
 * @create 2019-05-02 20:41
 */
public class CarTest {
    public static void main(String[] args) {
        Car car =new Car();
        car.setColour("红色");
        car.setId(10);

        Car car1 = new  Car();
        car1.setId(10);
        car1.setColour("红色");

        CarTest test = new CarTest();
        //true
        boolean isFlag =test.equals(car,car1);
        if(isFlag){
            System.out.println("两辆车一样");
        }else{
            System.out.println("不一样");
        }


    }
    public boolean equals(Car car,Car car1) {
        if(car.getColour() ==car1.getColour() && car.getId() == car1.getId()){
            return true;
        }else{
            return false;
        }

    }
}
