package map;

import java.util.Hashtable;
import java.util.Set;

public class HashtableExampleEntrySetGenerics 
{

	public static void main(String[] args) 
	{
		Hashtable st = new Hashtable() ;
		st.put(1, "Sarjerao") ; st.put(2, "Manager") ; st.put(3, "Selenium") ;
		
		Hashtable<Integer, String> st1 = new Hashtable<Integer, String>() ;
		st1.put(1, "Sarjerao") ; st1.put(2, "Manager") ; st1.put(3, "Selenium") ;
		st1.put(3, "Selenium") ; // Store only unique values
		// No null key values throws Null-pointer Exception
				
		System.out.println("*** Printing Values from Hashtable using entrySet() ***");
		Set s = st1.entrySet() ;
		System.out.println(s);
		
		if(st.equals(st1))
			System.out.println("Both Hashtable are equal ");
		
		System.out.println(st1.get(1));
		
		System.out.println("HashCode value of st1 " + st1.hashCode());

	}

}
