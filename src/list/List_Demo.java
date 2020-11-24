package list;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class List_Demo {

	public static void main(String[] args) {

		List list = new Vector();
		list.add("India");
		list.add("China");
		list.add("Sri-Lanka");
		list.add("Russia");
		list.add("B'desh");
		list.add("Pakistan");
		list.add(5, "India");
		System.out.println(list.get(5));
		System.out.println("*********************");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains("India"));

		// add a new list
		List newCountries = new Vector();
		newCountries.add("Turkey");
		newCountries.add("Egypt");
		newCountries.add("Canada");
		list.addAll(1, newCountries);
		System.out.println("**********************");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.remove("Pakistan"));
		System.out.println("*********************************");
		Collections.sort(list);
		System.out.println(list);
		// length of this list, wheter a "India"

	}

}
