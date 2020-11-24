package map;

import java.util.Hashtable;

public class HashtableExample 
{
	public static void main(String[] args) 
	{
		Hashtable ht1 = new Hashtable() ;
		ht1.put(1, "Selenium") ;
		ht1.put(2, "QTP") ;
		ht1.put(3, "Java") ;

		Hashtable ht2 = new Hashtable() ;
	
		ht2 = (Hashtable)ht1.clone() ;
		
		System.out.println("HT-1 Values "+ht1);
		System.out.println("HT-2 Values "+ht2);
		
		ht2.clear();
		System.out.println("After Clear HT-1 Values "+ht1);
		System.out.println("After Clear HT-2 Values "+ht2);
		
		
	}

}
