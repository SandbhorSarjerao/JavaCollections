package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class Set_Demo {

	public static void main(String[] args) {

		Set set = new LinkedHashSet();
		set.add("India");
		set.add("China");
		set.add("Sri-Lanka");
		set.add("Russia");
		set.add("B'desh");
		set.add("Pakistan");
		set.add(5);
		System.out.println(((List) set).get(5));
		System.out.println("*********************");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("India"));

		// add a new list
		Set newCountries = new HashSet();
		newCountries.add("Turkey");
		newCountries.add("Egypt");
		newCountries.add("Canada");
		set.addAll(newCountries);
		System.out.println("**********************");
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.remove("Pakistan"));
		System.out.println("*********************************");
		Collections.sort((List) set);
		System.out.println(set);

		// length of this list, wheter a "India"

		SortedSet set1 = new TreeSet();

	}

}
