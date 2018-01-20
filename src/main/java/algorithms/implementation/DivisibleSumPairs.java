package algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int count = 0;
		int array[] = new int[n];
		for(int i=0;i<n;i++){
			array[i] = scanner.nextInt();
		}
		 
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if((array[i]+array[j]) % k == 0){
//					System.out.println(array[i] +":"+array[j]);
					count++;
				}
			}
		}
		System.out.println(count);
		scanner.close();
	}
	
	

}
