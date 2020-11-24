package map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableExampleUsingEnumeration 
{
	public static void main(String[] args) 
	{
		Hashtable st = new Hashtable() ;
		st.put(1, "Sarjerao") ;
		st.put(2, "Manager") ;
		st.put(3, "Selenium") ;
		
		if(st.contains("Sarjerao"))
			System.out.println("Value is found");
		
		Enumeration e = st.elements() ;
		System.out.println("*** Printing Values from Hashtable using Enumeration ***");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
		
		
		
		
	}

}
