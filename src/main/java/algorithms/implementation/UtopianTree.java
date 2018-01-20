package algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		for(int test=0;test<testCases;test++){
			int height = 1;
			int testValue = scanner.nextInt();
			for(int i=0;i<testValue;i++){
				if(i % 2 == 0){
					height +=height;
				}else{
					height +=1;
				}
			}
			System.out.println(height);
		}
		scanner.close();
	}

}
