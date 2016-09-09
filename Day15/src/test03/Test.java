package test03;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		
		students[0] = new Student(3.2, "a", "001", "010-0000-0000");
		students[1] = new Student(2.5, "b", "002", "010-0000-0000");
		students[2] = new Student(3, "c", "003", "010-0000-0000");
		students[3] = new Student(0.5, "d", "004", "010-0000-0000");
		students[4] = new Student(1.5, "e", "005", "010-0000-0000");
		
		Arrays.sort(students);
		
		System.out.println(students[0].getName());
	}
}
