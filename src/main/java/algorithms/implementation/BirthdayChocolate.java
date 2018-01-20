package algorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] chocolate = new int[n];
		for(int i=0;i<n;i++){
			chocolate[i]=scanner.nextInt();
		}
		
		int d = scanner.nextInt();
		int m = scanner.nextInt();
		int numberPieces = 0;
		for(int i=0;i<chocolate.length-(m-1);i++){
			int total = 0;
			for(int j=i;j<(i+m);j++){
				total +=chocolate[j];
			}
			if(total==d){
				numberPieces++;
			}
		}
		System.out.println(numberPieces);
		scanner.close();
	}

}
