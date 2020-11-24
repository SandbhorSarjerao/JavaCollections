package checkHighestMarksOfStudent;

import java.util.ArrayList;

public class CheckStudentHighestMarks {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();
		students.add("sunil-56-88-23");
		students.add("bindul-88-60-10");
		students.add("john-70-49-65");
		System.out.println(new CheckHighestMarks().checkHighest(students));
	}
}
