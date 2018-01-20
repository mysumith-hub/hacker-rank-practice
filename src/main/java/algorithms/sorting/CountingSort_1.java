package algorithms.sorting;

import java.util.Scanner;

public class CountingSort_1 {
	public static int[] countNumbers(int[] ar) {
		int[] counter = new int[100];
		for (int i = 0; i < ar.length; i++) {
			counter[ar[i]]++;
		}
		return counter;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int[] ar = new int[number];
		for (int i = 0; i < number; i++) {
			ar[i] = scan.nextInt();
		}
		int[] counter = countNumbers(ar);
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i] + " ");
		}
		scan.close();
	}
}
