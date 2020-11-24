package list;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	public static <E> void main(String[] args) 
	{
		/*
		ArrayList arr = new ArrayList() ;
		ArrayList<Integer> arr1 = new ArrayList<Integer>() ;
		ArrayList<String> arr2 = new ArrayList<String>() ;
		ArrayList<E> arr3 = new ArrayList<E>() ;
		*/
		
		Employee e1 = new Employee(25777 , "Sarjerao" , "QA") ;
		Employee e2 = new Employee(25776 , "Mukesh" , "QA") ;
		Employee e3 = new Employee(25775 , "Amol" , "QA") ;

		ArrayList<Employee> emp = new ArrayList<Employee>() ;
		emp.add(e1) ;
		emp.add(e2) ;
		emp.add(e3) ;

		Iterator<Employee> itr = emp.iterator() ;
		
		while(itr.hasNext())
		{
			Employee emp1 = itr.next() ;
			System.out.println(emp1.id);
			System.out.println(emp1.name);
			System.out.println(emp1.dept);
			System.out.println();
		}
	}
}