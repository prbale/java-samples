package Collections.Comparator;

public class Student implements Comparable<Student> {

	int student_id;
	String student_name;
	int student_age;
	
	public Student(int id, String name, int age) {
	
		this.student_age = age;
		this.student_id = id;
		this.student_name = name;
	}
	
	@Override
	public int compareTo(Student o) {

		if(this.student_id < o.student_id ) {
			return -1;
		}
		else if(this.student_id > o.student_id ) {
			return 1;
		} 
		else 
			return 0;
	}


	@Override
	public String toString() {
		return "Student : id : " + student_id + " Name : " + student_name + " Age : " + student_age;
	}
}