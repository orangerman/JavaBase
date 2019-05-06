package javafan.test3;

/**
 * @author java_fan
 * @create 2019-05-06 13:56
 */


interface A {
    int x = 1;
}

class B {
    int x = 2;
}

public class C extends B implements A {
    public  void px() {
        System.out.println(super.x);//2
        System.out.println(A.x);//1
    }

    public static void main(String[] args) {
        new C().px();
    }
}

