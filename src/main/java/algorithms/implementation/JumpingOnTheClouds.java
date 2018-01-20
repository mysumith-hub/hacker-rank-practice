package algorithms.implementation;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void old(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] cloudsStatus = new int[scanner.nextInt()];
		int jumps = scanner.nextInt();
//		for(int i=0;i<cloudsStatus.length;i++){
//			cloudsStatus[i] = scanner.nextInt();
//		}
//		
//		int energy = 100;
//		int jumpIndex = 0;
//		do {
//			if(jumpIndex+jumps > cloudsStatus.length-1){
//				jumpIndex = jumps - ((cloudsStatus.length-1)-jumpIndex);
//				jumpIndex--;
//			}else{
//				jumpIndex +=jumps;	
//			}
//			if(cloudsStatus[jumpIndex] == 1){
//				energy -=3;
//			}else{
//				energy -= 1;
//			}
//			
//		} while (jumpIndex != 0);
//		System.out.println(energy);
		int thundercloud = 0;
		for(int i = 0; i < cloudsStatus.length; i++) {
	        int tmp = scanner.nextInt();
	        if((i % jumps == 0) && tmp == 1)
	            thundercloud++;            
	    }
	    System.out.println(100 - (cloudsStatus.length / jumps) - (2 * thundercloud));
	    
		
		scanner.close();
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int counter = 0;
        int jumps = 0;
        for(int i=1;i<n;i++){
            counter +=1;
            
            if(counter==2 || i==n-1){
                   if( c[i] == 1){
                       i = i-1;
                   }
                counter = 0;
                jumps +=1;
            }
            
        }
        System.out.println(jumps);
        in.close();
    }

}
