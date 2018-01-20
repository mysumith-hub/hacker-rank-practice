package algorithms.implementation;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();;
		int beverage = 0;
		for(int i=0;i<n;i++){
			int hurdle = scanner.nextInt();
			if(hurdle > k){
				beverage += hurdle-k;
				k += hurdle - k;
			}
		}
		
		System.out.println(beverage);
		scanner.close();
	}

}
