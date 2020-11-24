package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>() ;
		
		ll.add("1") ;
		ll.add("2") ;
		ll.add("3") ;
		ll.add("4") ;
		ll.add("5") ;
		
		System.out.println(ll);
		ll.addFirst("0");
		ll.addLast("6");
		
		System.out.println(ll);
		
		ll.get(3) ;
		System.out.println(ll.get(3));
		
		ll.set(0, "10") ;
		System.out.println(ll);
		
		ll.removeFirst() ;
		System.out.println(ll);
		
		ll.removeLast() ;
		System.out.println(ll);
		
		ll.remove(4) ; 
		System.out.println(ll);
		
		for(String str : ll)
		{
			System.out.println(str);
		}

	    Iterator<String> itr = ll.iterator() ;
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	    
		
	}

}
