package Collections.Custom.ArrayList;

import Collections.Generics.Employee;

public class CustomArrayListTest {

	public static void main(String[] args) {
		
		ArrayListCustom<Employee> employeeList = new ArrayListCustom<>();
		
		Employee e1 = new Employee("Prashant Bale", "Pune", 1);
		Employee e2 = new Employee("Sameer Sanaye", "Mumbai", 2);
		Employee e3 = new Employee("Drup Desai", "Gujrat", 3);
		Employee e4 = new Employee("Amar Sawant", "Pune", 4);
		Employee e5 = new Employee("Anish Panday", "Madhya Pradesh", 5);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		System.out.println("\n\n--------- Initial List ------------");
		employeeList.display();
		
		System.out.println("\n\n--------- Employee Details ------------");
		int index = 3;
		System.out.println("Employee details at index : " + index + " is : " +  employeeList.get(index));
		
		System.out.println("\n\n--------- Employee List after removing item at 2nd ------------");
		Employee remEmp = (Employee)employeeList.remove(2);
		System.out.println("Removed : " + remEmp + "\n");	
		employeeList.display();

		System.out.println("\n\n--------- Employee List after adding Ganesh at index 1st ------------");
		Employee newEmp = new Employee("Ganesh Shinde", "Mumbai", 9);
		employeeList.add(2, newEmp);
		employeeList.display();


	}
}

