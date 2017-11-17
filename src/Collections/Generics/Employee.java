package Collections.Generics;

/**
 * @author Prashant Collection : List demo
 */
public class Employee {

	private String employeeName;
	private String employeeAddress;
	private int employeeId;

	public Employee(String name, String address, int id) {
		this.setEmployeeName(name);
		this.setEmployeeAddress(address);
		this.setEmployeeId(id);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String toString() {
		return employeeName;
	}

}