package datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {
	 static int[] leftRotation(int[] a, int d) {
	        int r = d % a.length;
	        //System.out.println(r);
	        int[] na = new int[a.length]; 
	        System.arraycopy(a,0,na,a.length-r,r); 
	        System.arraycopy(a,r,na,0,a.length-r);
	        return na;
	        
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int d = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i = 0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] result = leftRotation(a, d);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");


	        in.close();
	    }
}
