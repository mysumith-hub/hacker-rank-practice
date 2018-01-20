package algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		String t = scanner.next();
		
		int k = scanner.nextInt();
		char[] SArray = s.toCharArray();
		char[] TArray = t.toCharArray();
		int match = 0;
		for(int i=0;i<SArray.length && i<TArray.length;i++){
			
			if(SArray[i] != TArray[i]){
				break;
			}
			match = i;
		}
		match++;
		if(s.length()<t.length()){ 
			if((t.length()-s.length()) % 2 == 0){
				System.out.println("Yes");	
			}else{
				System.out.println("No");
			}
			
		}else if(k >= (s.length()-match + t.length()-match)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}
//
//	aaaaaaaaaa
//	aaaaa
//	7
//	Yes
}
