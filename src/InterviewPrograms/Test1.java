package InterviewPrograms;

/**
 * Created by Prashant on 01-10-2016.
 */

class A {
    public static void test() {
        System.out.println("testing... A !");
    }
}

class B extends A {
    public static void test() {
        System.out.println("testing... B !");
    }
}

public class Test1 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.test();
        b.test();

        b = (B)a;
        b.test();


    }

}
