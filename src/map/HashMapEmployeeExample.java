package map;

import java.util.HashMap;
import java.util.Map.Entry;

import list.Employee;

public class HashMapEmployeeExample
{
	public static void main(String[] args) 
	{
		HashMap<Integer , Employee> emp = new HashMap<Integer,Employee>() ;
		Employee e1 = new Employee(121 , "Tom" , "Admin");
		Employee e2 = new Employee(122 , "Peter" , "QA");
		Employee e3 = new Employee(123 , "Steve" , "Dev");
		
		emp.put(1, e1) ;
		emp.put(2, e2) ;
		emp.put(3, e3) ;

		for(Entry<Integer,Employee> m : emp.entrySet())
		{
			int key = m.getKey() ;
			Employee e = m.getValue();
			System.out.println("Employee "+key+" Info: ");
			System.out.println(e.id + " " + e.name + " " + e.dept);
			System.out.println();
		}
	}

}
