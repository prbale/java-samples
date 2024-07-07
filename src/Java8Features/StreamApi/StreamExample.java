package Java8Features.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Prashant",  "Engineering", 50000),
            new Employee("Ajit",  "Admin", 70000),
            new Employee("Ganesh",  "Engineering", 80000),
            new Employee("Deepak",  "Audit", 20000),
            new Employee("Vishal",  "Engineering", 30000)
        );


       List<String> engineeringEmployeeList = employees.stream() // Get Stream
                .filter(e -> "Engineering".equals(e.getDepartment())) //Filter all inconing employees with Engineering department.
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())) // Sort as per salary
                .map(Employee::getName) // Fetch only Emplyee names
                .collect(Collectors.toList()); // Collect to List<String>


        System.out.println("List: " + engineeringEmployeeList);
    }
}
