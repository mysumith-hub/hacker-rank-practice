package algorithms.warmup;

import java.util.Scanner;

public class ArrayBigSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		long sum = 0; 
		for(int i=0;i<size; i++){
			sum += scanner.nextInt();
		}
		System.out.println(sum);
		scanner.close();
	}
}
