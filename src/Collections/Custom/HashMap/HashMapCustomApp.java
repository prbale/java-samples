package Collections.Custom.HashMap;

/**
 * Created by Prashant on 30-07-2016.
 */
public class HashMapCustomApp {

    public static void main(String[] args) {

        HashMapCustom<Integer, Integer> hashmapCustom = new HashMapCustom<>();
        hashmapCustom.put(1, 100);
        hashmapCustom.put(2, 200);
        hashmapCustom.put(3, 300);
        hashmapCustom.put(3, 400);
        hashmapCustom.put(4, 500);

        hashmapCustom.display();
        hashmapCustom.displaySet();

        System.out.println(hashmapCustom.get(1) + "");
        System.out.println(hashmapCustom.get(2) + "");
        System.out.println(hashmapCustom.get(3) + "");
        System.out.println(hashmapCustom.get(4) + "");

        System.out.println("\n\n-----------------");
        int value = 400;
        System.out.println("Searching for : " + value );
        if( hashmapCustom.containsValue(value) != null )
            System.out.println("Yes ! It is present in the HashMap");
        else
            System.out.println("Oops ! It is not present in the HashMap");

        System.out.println("\n\n-----------------");
        System.out.println("Removing all the data from Map");

        hashmapCustom.remove(1);
        hashmapCustom.remove(2);
        hashmapCustom.remove(3);
        hashmapCustom.remove(4);

        System.out.println("-----------------");
        hashmapCustom.display();


    }
}
