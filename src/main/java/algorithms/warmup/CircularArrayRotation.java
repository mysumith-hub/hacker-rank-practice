package algorithms.warmup;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		for (int j = 0; j < k; j++) {
			int temp = a[a.length - 1];

			for (int i = a.length - 1; i > 0; i--) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
		int[] que = new int[q];
		int[] results = new int[q];
		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();
			que[a0] = m;
//			results[a0] = a[m];
		}
		for(int q0=0;q0<que.length;q0++){
			System.out.println(a[que[q0]]);
		}
//		for (int i = 0; i < results.length; i++) {
//			System.out.println(results[i]);
//		}
		in.close();

//		int[] a = {1, 2, 3};
//		int k = 2;
//		
//		int[] queue = {0,2,1};
//		for(int j=0;j<k;j++){
//			int temp = a[a.length-1];
//			
//			for(int i=a.length-1;i>0;i--){
//				a[i] = a[i-1];
//			}
//			a[0] = temp;	
//		}
//		
//		for(int i=0;i<a.length;i++){
//			System.out.print(a[i]+",");
//		}
//		System.out.println();
//		for (int i = 0; i<queue.length; i++) {
//			System.out.println(a[queue[i]]);
//		}
		
	}
	
}
