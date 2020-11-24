package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer , String> () ;
		hm.put(1, "Selenium") ;
		hm.put(2, "QTP") ;
		hm.put(3, "RFT") ;
		hm.put(4, "TestComplete") ;
		hm.put(5, "JAVA") ;
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		System.out.println(hm);
		
		for(Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		hm.remove(5) ;
		System.out.println(hm);
		
	}

}
