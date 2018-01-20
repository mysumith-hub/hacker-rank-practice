package algorithms.warmup;

import java.util.Scanner;

public class Solution {

	static int solveMeFirst(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.print("enter first value :");
		a = in.nextInt();
		int b;
		System.out.print("enter second value :");
		b = in.nextInt();
		in.close();
		int sum;
		sum = solveMeFirst(a, b);

		System.out.println("Sum Value: " + sum);
	}
}