package algorithms.implementation;import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		int rotation = scanner.nextInt();
		int queries = scanner.nextInt();
		for(int i=0;i<numbers.length;i++){
			numbers[i] = scanner.nextInt();
		}
//		while(rotation-- >0){
//			numbers = rotate(numbers);
//		}
//		while(queries-- >0){
//			System.out.println(numbers[scanner.nextInt()]);
//		}
		/**
		 * Using mod operator
		 */
		while(queries-- >0){
			int m = scanner.nextInt();
	        System.out.println(numbers[(n - (rotation % n)+ m) % n]);
		}
		scanner.close();
	}
	
	public static int[] rotate(int[] numbers){
		
		int temp = numbers[numbers.length-1];
		for(int i=numbers.length-1;i>0;i--){
			numbers[i] = numbers[i-1];
		}
		numbers[0] = temp;
		return numbers;
		
	}

}
