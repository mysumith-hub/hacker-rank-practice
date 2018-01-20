package algorithms.implementation;

import java.util.Scanner;

public class EqualizeTheArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] counter = new int[101];
		int bigOne = 0;
		for (int i = 0; i < n; i++) {
			int ele = scanner.nextInt();
			counter[ele]++;
			if (counter[ele] > bigOne) {
				bigOne = counter[ele];
			}
		}
		System.out.println(n - bigOne);
		scanner.close();
	}
}
