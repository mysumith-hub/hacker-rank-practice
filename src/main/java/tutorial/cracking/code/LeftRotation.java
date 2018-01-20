package tutorial.cracking.code;

import java.util.Scanner;

public class LeftRotation {

	// public static void main(String[] args) {
	// Scanner scanner = new Scanner(System.in);
	// int numbers = scanner.nextInt();
	// int rotations = scanner.nextInt();
	//// int[] items = {1, 2, 3, 4, 5};
	// int[] newItems = new int[numbers];
	// for(int i=0;i<numbers;i++){
	// int item = scanner.nextInt();
	// int index = ((numbers % rotations) + i) % numbers;
	// newItems[index] = item;
	// }
	//// int[] newItems = new int[items.length];
	//// for(int i=0;i<items.length;i++){
	//// int index = ((numbers % rotations) + i) % numbers;
	//// newItems[index] = items[i];
	//// }
	// for(int item : newItems){
	// System.out.print(item +" ");
	// }
	//
	// }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers = scanner.nextInt();
		int rotations = scanner.nextInt();
		int[] items = new int[numbers];
		for (int i = 0; i < numbers; i++) {
			items[i] = scanner.nextInt();
		}
		while (rotations-- > 0) {
			items = rotate(items);
		}
		for (int item : items) {
			System.out.print(item + " ");
		}
		scanner.close();
	}

	public static int[] rotate(int[] items) {

		int temp = items[0];
		for (int i = 0; i < items.length - 1; i++) {
			items[i] = items[i + 1];
		}
		items[items.length - 1] = temp;
		return items;

	}

	public static int[] rotateArray(int[] arr, int d) {
		// Because the constraints state d < n, we need not concern ourselves
		// with shifting > n units.
		int n = arr.length;

		// Create new array for rotated elements:
		int[] rotated = new int[n];

		// Copy segments of shifted elements to rotated array:
		System.arraycopy(arr, d, rotated, 0, n - d);
		System.arraycopy(arr, 0, rotated, n - d, d);

		return rotated;
	}

}
