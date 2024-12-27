package pack1;

import java.util.Comparator;

public class NameAscendingComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub4
		int r=o1.name.compareTo(o2.name);
		return r;
	}

}
