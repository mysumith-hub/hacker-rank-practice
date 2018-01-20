package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		
		for(int i=0;i<testCases;i++){
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int temp = 0;
			for(int j=0;j<n;j++){
				int t = scanner.nextInt();
				if(t <= 0){
					temp++;
				}
			}
			if(temp >= k){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}	
		}
		
		scanner.close();
		
	}

}
