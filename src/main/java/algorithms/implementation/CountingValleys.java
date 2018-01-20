package algorithms.implementation;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String steps = scanner.next();
//		char[] chars = {'U','D','D','D','U','D','U','U','D','D','U','U'};
		
		int step = 0;
		int valleys = 0; 
		boolean down = false;
		for(int i=0;i<size;i++){
			char c = steps.charAt(i);
			if(c == 'U'){
				step ++;
			}else if (c == 'D'){
				step --;
			}
			
			if(step == -1){
				down = true;
			}
			if(down == true && step == 0){
				valleys++;
				down=false;
			}
//			System.out.println(c+" "+steps);
		}
		System.out.println(valleys);
		scanner.close();
	}

}
