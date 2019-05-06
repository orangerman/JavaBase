package javafan.test2;

/**
 * @author java_fan
 * @create 2019-05-06 12:57
 */

/**
 * 接口的使用
 */
public class UsbTest {
    public static void main(String[] args) {


        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transferData(flash);

        computer.transferData(new Printer());
    }
}

class Computer {
    public void transferData(USB usb) {
        usb.start();
        System.out.println("传输数据");
        usb.stop();
    }
}

interface USB {


    void start();

    void stop();
}

class Flash implements USB {
    @Override
    public void start() {
        System.out.println("优盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("优盘关闭工作");
    }
}

class Printer implements USB {
    @Override
    public void start() {

        System.out.println("开始打印");
    }

    @Override
    public void stop() {
        System.out.println("停止打印");
    }
}
