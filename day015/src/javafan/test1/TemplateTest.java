package javafan.test1;

/**
 * @author java_fan
 * @create 2019-05-05 15:45
 */

/**
 * 抽象类的应用：模板方法的设计模式
 */
public class TemplateTest {

    public static void main(String[] args) {
        Template t = new SubTemplate();
        t.spendTime();
    }
}

abstract class Template{
    //计算某段代码所花费时间
    public void spendTime(){
        long staff= System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间：" + (end - staff));
    }

    public abstract  void code();
}


class  SubTemplate extends Template{
    @Override
    public void code() {
        for(int i = 2 ; i < 1000;i++){
            boolean isFlage = true;
            for(int j = 2 ; j <= Math.sqrt(j);j++){
                if(i % j ==0){
                    isFlage = false;
                    break;
                }

            }
            if(isFlage){
                System.out.println(i);

            }
        }
    }
}
