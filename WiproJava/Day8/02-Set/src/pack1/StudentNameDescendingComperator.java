package pack1;

import java.util.Comparator;

public class StudentNameDescendingComperator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int r=o2.getName().compareTo(o1.getName());
		return r;
		
	}

}
