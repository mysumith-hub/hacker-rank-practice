package algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x1=scanner.nextInt();
		int v1=scanner.nextInt();
		int x2=scanner.nextInt();
		int v2=scanner.nextInt();
		Kangaroo kangaroo = new Kangaroo();
		kangaroo.exexute(x1, v1, x2, v2);	
		scanner.close();
	}
	
	public void exexute(int x1, int v1, int x2, int v2){
		
		while(true){
			
			if((x1>x2 && v1>=v2) || (x1<x2 && v1<=v2)){
				System.out.println("NO");
				break;
			}
			x1 +=v1;
			x2 +=v2;
//			System.out.println(x1 +" : "+x2);
			if(x1 == x2){
				System.out.println("YES");
//				System.out.println(x1 +" : "+x2);
				break;
			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
}
