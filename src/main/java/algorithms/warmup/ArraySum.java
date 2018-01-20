package algorithms.warmup;

import java.util.Scanner;

public class ArraySum {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int size;
		int sum = 0;
		size = scanner.nextInt();
		for(int i=0; i< size; i++){
			sum = sum+scanner.nextInt();
		}
		System.out.println(sum);
		scanner.close();
	}
}
