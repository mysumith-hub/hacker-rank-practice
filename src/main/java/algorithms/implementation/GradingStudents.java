package algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		GradingStudents gradingStudents = new GradingStudents();
		int size = scanner.nextInt();
		int[] results = new int[size];
		for (int i = 0; i < size; i++) {
			int grade = scanner.nextInt();
			results[i] = gradingStudents.roundGrade(grade);
		}
		gradingStudents.print(results);
		scanner.close();
	}

	public void print(int[] results) {
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}

	public int roundGrade(int grade) {
		if (grade >= 38) {
			int mod5 = grade % 5;
			if (mod5 > 2) {
				grade += 5 - mod5;
			}
		}

		return grade;
	}
}
