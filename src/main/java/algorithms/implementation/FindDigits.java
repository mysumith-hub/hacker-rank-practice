package algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		while(testCases-- > 0){
			int digit = scanner.nextInt();
			printDigits(digit);
		}
		scanner.close();
	}
	public static void printDigits(int digit){
		int tempDigit = digit;
		int count = 0;
		while(tempDigit != 0){
			int i = tempDigit % 10;
			tempDigit = tempDigit/10;
			if(i != 0 && digit % i == 0){
				count++;
			}
		}
		System.out.println(count);
	}
}
