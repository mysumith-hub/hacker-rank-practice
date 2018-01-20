package algorithms.warmup;

import java.util.Scanner;

public class DiagnoalDiff {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] array = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		int sumA = 0;
		int sumB = 0;
		int j = size-1;
		for(int i=0;i<size;i++){
			
			sumA += array[i][i];
			sumB += array[j][i];
			j--;
		}
		System.out.println(sumA > sumB ? sumA - sumB : sumB - sumA);
		scanner.close();
	}
}
