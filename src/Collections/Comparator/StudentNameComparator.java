package Collections.Comparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

		return (o1.student_name.compareTo(o2.student_name));
		
	}


}