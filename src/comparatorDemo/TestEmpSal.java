package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmpSal {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1005, "Ajay", 10000));
		list.add(new Employee(1001, "Vjay", 10));
		list.add(new Employee(1002, "Jay", 100));

		Collections.sort(list, new SalaryComparator());

		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = (Employee) itr.next();
			System.out.println(emp.empId + " " + emp.name + " " + emp.sal);
		}
	}
}
