package Collections.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class MainClass {
	
    public static void main(String[] args) {
    
    	ArrayList<Student> studList = new ArrayList<>();
    	
    	Student st1 = new Student(4, "Prashant", 31);
    	Student st2 = new Student(2, "Ajit", 28);
    	Student st3 = new Student(3, "Hemant", 29);
    	Student st4 = new Student(1, "Ganesh", 33);
    	
    	studList.add(st1);
    	studList.add(st2);
    	studList.add(st3);
    	studList.add(st4);
    	
    	Collections.sort(studList);

    	Iterator it = studList.iterator();
    	while(it.hasNext()) {	
    		System.out.println(it.next());
    	}
    	
    	// The above while loop print the data comparing id's
    	// what if we want student data according to age or by name? 
    	
    	
    	
    }
}