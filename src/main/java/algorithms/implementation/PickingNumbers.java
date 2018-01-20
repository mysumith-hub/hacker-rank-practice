package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

//	public static void main(String[] args) {
//		// int[] numbers = {4, 6, 5, 3, 3, 1};
//		Scanner scanner = new Scanner(System.in);
//		int size = scanner.nextInt();
//		int[] numbers = new int[size];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = scanner.nextInt();
//		}
//		int counter = 0, tempCount = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(getNumbers(i, numbers));
//		}
//
//		System.out.println(counter);
//	}
//
//	static boolean exist = false;
//
//	public static int getNumbers(int i, int[] numbers) {
//		int count = 0;
//		int sorter[] = new int[numbers.length];
//
//		for (int j = i + 1; j < numbers.length; j++) {
//			if (Math.abs(numbers[i] - numbers[j]) <= 1 && numbers[i] != 0 && numbers[j] != 0) {
//				sorter[i] = numbers[i];
//				sorter[j] = numbers[j];
//			}
//
//		}
//		if (!numbers.equals(sorter)) {
//			getNumbers(0, sorter);
//		}
//
//		for (int j : sorter) {
//			if (j != 0) {
//				count++;
//			}
//		}
//
//		return count;
//	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];        
        int highCount = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        
        for(int i = 0; i < n; i++){
            int currentCount = 0;
            for(int j = 0; j <= i; j++){
                if (a[i] - a[j] <= 1){
                    currentCount++;
                    if (currentCount > highCount){
                        highCount = currentCount;
                    }
                }
            }
        }
        System.out.println(highCount);
    }
	
}
