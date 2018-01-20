package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		while(testCases-- >0){
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			// Non efficient way
			int count = 0;
			do{
				double sqrt = Math.sqrt(A);
				
				if(sqrt - (int)sqrt == 0){
					count++;
				}
			}while(A++ <B);
			System.out.println(count);
			
			// efficient way
//			System.out.println((int) Math.floor(Math.sqrt(B)) - (int) Math.ceil(Math.sqrt(A)) + 1);
			
		}
		scanner.close();

	}

}
