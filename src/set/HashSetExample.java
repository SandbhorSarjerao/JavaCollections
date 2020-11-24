package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample 
{
	public static void main(String[] args) 
	{
		Set<String> hs1 = new HashSet<> () ;
		hs1.add("Jan") ; hs1.add("Feb") ; hs1.add("Mar") ; hs1.add("Apr") ;
		hs1.add("May") ; hs1.add("Jun") ; hs1.add("Jul") ; hs1.add("Aug") ;
		hs1.add("Sept") ; hs1.add("Oct") ; hs1.add("Nov") ; hs1.add("Dec") ;
		
		System.out.println(hs1); System.out.println();
		
		HashSet <String> hs = new HashSet<> () ;
		hs.add("abc") ;
		hs.add("1") ;
		hs.add("Sarjerao") ;
		hs.add("!@!@$!") ;
		
		System.out.println(hs); System.out.println();
		
		for(String str : hs)
		System.out.println(str);

	}

}
