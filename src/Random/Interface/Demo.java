package Random.Interface;

interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation.");
    }
}

public class Demo {

    public static void main(String[] args) {
        MyInterface myClass = new MyClass();
        myClass.defaultMethod();
    }
}
