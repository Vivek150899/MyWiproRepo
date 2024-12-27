package pack1;

import java.util.Comparator;

public class StudentNameAscendingComprator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int r=o1.getName().compareTo(o2.getName());
		return r;
		
	}

}
