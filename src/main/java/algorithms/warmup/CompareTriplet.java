package algorithms.warmup;

import java.util.Scanner;

public class CompareTriplet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		System.out.println(a0+" "+b0+" - "+a1+" "+b1+" - "+a2+" "+b2);
		int alice=0, bob=0;
		if(a0>b0){
			alice = alice+1;
		}else if (a0 != b0) {
			bob = bob+1;
		}
		if(a1>b1){
			alice = alice+1;
		}else if(a1 != b1){
			bob = bob+1;
		}
		if(a2>b2){
			alice = alice+1;
		}else if(a2 != b2){
			bob = bob+1;
		}
		in.close();
		System.out.println(alice+" "+bob);
	}
}
