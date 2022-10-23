package Collections.Generics;

public class ListDriver {
	
    public static void main(String[] args) {

    	List<String> glist = new List<>(10);
    	glist.add("Prashant");
    	glist.add("Ajit");
    	glist.add("Ganesh");
    	glist.add("Swapnil");
    	glist.add("Ramesh");
    	
    	System.out.println(glist.toString());
    	
    	List<Integer> iList = new List<>(10);
    	iList.add(1);
    	iList.add(4);
    	iList.add(2);
    	iList.add(3);
    	iList.add(6);
    	iList.add(9);
    	
    	System.out.println(iList.toString());
    	
    	
    	List<Employee> eList = new List<>(5);
    	eList.add( new Employee("Prashant", "Pune", 1));
    	eList.add( new Employee("Ganesh", "Himachal", 2));
    	eList.add( new Employee("Sameer", "Mumbai", 3));
    	
    	System.out.println(eList.toString());
    	
    }
}