package algorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers = scanner.nextInt();
		int large = 0;
		int count = 0;
		while(numbers-- >0){
			int item = scanner.nextInt();
			if(item == large){
				count +=1;
			}
			if(item>large){
				large = item;
				count = 1;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
