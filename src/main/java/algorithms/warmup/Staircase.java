package algorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int height = 10;
		for(int i = height;i>0;i--){
			for(int j=0;j<height;j++){
				if(j<i-1){
					System.out.print(" ");
				}else{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
