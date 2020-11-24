package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>() ;
		lhs.add("Jan") ; lhs.add("Feb") ; lhs.add("Mar") ; lhs.add("Apr") ;
		lhs.add("May") ; lhs.add("Jun") ; lhs.add("Jul") ; lhs.add("Aug") ;
		lhs.add("Sept") ; lhs.add("Oct") ; lhs.add("Nov") ; lhs.add("Dec") ;
		
		System.out.println(lhs); System.out.println();

		for(String str:lhs)
			System.out.println(str);
	}

}
