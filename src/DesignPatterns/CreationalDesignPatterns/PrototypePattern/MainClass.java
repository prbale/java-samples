package DesignPatterns.CreationalDesignPatterns.PrototypePattern;

import java.util.List;

public class MainClass {
	
    public static void main(String[] args) throws CloneNotSupportedException {

			Employees emps = new Employees();
			emps.loadData();

			Employees empNew = (Employees) emps.clone();
			Employees empNew1 = (Employees) emps.clone();

			List<String> list = empNew.getEmployeeList();
			list.add("Ganesh");

			List<String> list1 = empNew1.getEmployeeList();
			list1.add("Sameer");

			System.out.println("emps List: "+emps.getEmployeeList());
			System.out.println("empsNew List: "+list);
			System.out.println("empsNew1 List: "+list1);
		}
}