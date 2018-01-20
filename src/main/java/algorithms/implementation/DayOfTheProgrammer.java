package algorithms.implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println(solve(year));
		scanner.close();
	}
	public static String solve(int year){
		
		boolean isLeapYear = isLeapYear(year);
		
		if(year == 1918){
			return "26.09."+year;
		}
		if(isLeapYear){
			return "12.09."+year;
		}else{
			return "13.09."+year;
		}
		
	}
	public static boolean isLeapYear(int year){
		boolean isLeapYear = false;
		
		if(year<1918 && year % 4 == 0){
			{
				isLeapYear = true;
			}
		}else if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
			isLeapYear = true;
		}
		return isLeapYear;
	}
}
