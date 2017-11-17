package InterviewPrograms;

/**
 * Created by Prashant on 11-10-2017.
 */
public class StaticDemo {

        public static void main(String[] args) {
            method(null);


        }
        public static void method(Object o) {
            System.out.println("Object impl");
        }
        public static void method(String s) {
            System.out.println("String impl");
        }
    }
