package comparatorDemo;

import java.util.Comparator;

public class SalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1 = (Employee)o1;
		Employee emp2 = (Employee)o2;
		
		if(emp1.sal==emp2.sal)
		return 0;
		else if(emp1.sal>emp2.sal)
		return 1;
		else
		return -1;
	}
}
