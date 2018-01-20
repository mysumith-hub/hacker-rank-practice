package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		int positive = 0, negative = 0, zero = 0;
		for(int i=0; i< size; i++){
			array[i] = scanner.nextInt();
			if(array[i] > 0){
				positive +=1;
			}else if(array[i] < 0){
				negative += 1;
			}else{
				zero +=1;
			}
		}
		System.out.printf("%.6f",(double)positive/size);
		System.out.println();
		System.out.printf("%.6f",(double)negative/size);
		System.out.println();
		System.out.printf("%.6f",(double)zero/size);
		scanner.close();
	}
	
}
