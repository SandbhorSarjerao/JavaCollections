package map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("sunil-56-88-23");
		students.add("bindul-88-60-10");
		students.add("john-70-49-65");
		System.out.println(new TreeMapExample().checkHighest(students));
	}

	public String checkHighest(List<String> students) {
		Iterator<String> iterator = students.iterator();

		TreeMap<Integer, String> details = new TreeMap<>();
		int maxMarks = 0;
		String highestStudent = null;
		while (iterator.hasNext()) {
			String str = iterator.next();// sunil-56-88-23
			String studentDetails[] = str.split("-");
			int sum = 0;
			for (int i = 1; i < studentDetails.length; i++) {
				sum = sum + Integer.parseInt(studentDetails[i]);
			}
			details.put(sum, studentDetails[0]);

			/*
			 * if(sum>maxMarks) { maxMarks=sum; highestStudent=studentDetails[0]; }
			 */
		}
		System.out.println(details);
		System.out.println(details.lastKey() + "\t" + details.get(details.lastKey()));
		return "Name of highest scorer is " + highestStudent + "\n marks obtained is " + maxMarks;
	}

}
