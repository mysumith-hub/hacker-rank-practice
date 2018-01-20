package algorithms.implementation;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		Solution gradingStudents = new Solution();
		
		int size = scanner.nextInt();
		int[] results = new int[size];
		for(int i=0; i< size; i++){
			int grade = scanner.nextInt();
			results[i] = gradingStudents.roundGrade(grade);
		}
		gradingStudents.print(results);
		scanner.close();
	}
	public void print(int[] results){
		for(int i=0; i< results.length; i++){
			System.out.println(results[i]);
		}
	}
	public int roundGrade(int grade){
		int tempGrade = grade;
		tempGrade +=2;
		if (tempGrade % 5 == 0) {
		   grade = tempGrade;
		}
		return grade;
	}
}
