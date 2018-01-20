package algorithms.implementation;

import java.util.Scanner;

public class FactorOfTwoSets {

	Scanner scanner;
	int larger;
	int count; 
	public static void main(String args[]){
		new FactorOfTwoSets().findFactors();;
	}
	public void findFactors(){
		int oneCount = scanner.nextInt();
		int twoCount = scanner.nextInt();
//		int one[]  = {2,4};
//		int two[]  = {16,32,96};
		
		int one[]  = getarray(oneCount);
		int two[]  = getarray(twoCount);
		
//		larger = 96;
		for(int i=1;i<=larger;i++){
			boolean isFactor = true;
			boolean loadFactor = false;
			for(int j : one){
				if(checkFactor(i, j) != 0){
					isFactor = false;
					break;
				}
			}
			if(isFactor){
				loadFactor = true;
				for(int k : two){
					if(checkFactor(k, i) != 0){
						loadFactor = false;
						break;
					}	
				}	
			}
			if(loadFactor){
				count ++;
//				System.out.println("Checked:"+i);
			}
		}
		System.out.println(count);
	}
	public int checkFactor(int x, int y){
		return x % y;
	}
	public FactorOfTwoSets(){
		scanner = new Scanner(System.in);
	}
	public int[] getarray(int count){
		int[] numbers = new int[count];
		for(int i=0;i<count;i++){
			numbers[i] = scanner.nextInt();
			if(larger<numbers[i]){
				larger = numbers[i];
			}
		}
		return numbers;
	}
}
