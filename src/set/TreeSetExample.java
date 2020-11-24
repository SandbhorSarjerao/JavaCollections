package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet<String> trs = new TreeSet<>() ;
		trs.add("Jan") ; trs.add("Feb") ; trs.add("Mar") ; trs.add("Apr") ;
		trs.add("May") ; trs.add("Jun") ; trs.add("Jul") ; trs.add("Aug") ;
		trs.add("Sept") ; trs.add("Oct") ; trs.add("Nov") ; trs.add("Dec") ;
		
		System.out.println(trs); System.out.println();

		for(String str:trs)
			System.out.println(str); System.out.println();
			
		
		Set<Integer> trs1 = new TreeSet<>() ;
			trs1.add(1) ; trs1.add(3) ; trs1.add(5) ; trs1.add(7) ;
			trs1.add(9) ; trs1.add(11) ; trs1.add(2) ; trs1.add(4) ;
			trs1.add(6) ; trs1.add(8) ; trs1.add(10) ; trs1.add(12) ;
			
			System.out.println(trs1); System.out.println();

			for(int str:trs1)
				System.out.println(str);


	}

}
