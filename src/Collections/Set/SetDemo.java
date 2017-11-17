package Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Prashant
 * Collection : Set demo	
 */
public class SetDemo {
	
    public static void main(String[] args) {
    	
    	Set<Employee> list= new HashSet<Employee>();
    	
    	list.add( new Employee("Prashant", "Pune", 1));
    	list.add( new Employee("Ajit", "Airoli", 2));
    	list.add( new Employee("Ajit", "Airoli", 2));
    	list.add( new Employee("Deepak", "Mumbai", 3));
    	list.add( new Employee("Ankur", "Indore", 4));
    	list.add( new Employee("Ganesh", "Himachal", 5));

    	/*
    	Iterator iterator = list.iterator();
    	while( iterator.hasNext() ) {
    		
    		Employee emp = (Employee) iterator.next();
    		System.out.println("Employee Details: " + emp.getEmployeeName + " " + emp.getEmployeeAddress + " " + emp.getEmployeeId);
    	}
    	*/
    	
    	for( Employee emp : list ) {
    		System.out.println("Employee Details: " + emp.getEmployeeName() + " " + emp.getEmployeeAddress() + " " + emp.getEmployeeId());
    	}
    	
    	
    }
}