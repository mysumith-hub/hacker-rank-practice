package algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int t=0;t<n;t++){
			int persons = scanner.nextInt();
			int sweets = scanner.nextInt();
			int start = scanner.nextInt();
			start--;
			for(int i=0;i<sweets;i++){
				
				if(start == persons){
					start = 0;
				}
				start++;
			}
			System.out.println(start);	
		}
		
		scanner.close();
	}

}
