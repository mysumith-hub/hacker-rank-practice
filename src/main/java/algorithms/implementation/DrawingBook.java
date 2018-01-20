package algorithms.implementation;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve(5, 4);
		int pages = 5;
		int page = 4;
		Scanner scanner = new Scanner(System.in);
//		int pages = scanner.nextInt();
//		int page = scanner.nextInt();
		scanner.close();
		int count = 0;
		boolean isEven = pages % 2 == 0 ? true : false;
		boolean flag = pages / page  < 2 ? true : false;
		int i = 1;
		if(flag){
			i = pages;	
		}
		
		while(true){
			
			count++;
			
			if(isEven && flag){
				if(page == i || page == i+1){
					break;
				}
			}else{
				if(page == i || page == i-1){
					break;
				}
			}
			if(flag){
				i -=2;
			}else{
				i +=2;	
			}
			
			
		}
		System.out.println(count-1);
	}

	public static int solve(int n, int p) {
        int front = p >> 1;
        int back =  ((n & 1) == 1) 
                    ? (n - p) >> 1 // odd number of pages
                    : (n - p + 1) >> 1; // even number of pages

        return Math.min(front, back);
    }
    
    public void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        scan.close();
        
        System.out.println(solve(n, p));
    }
}
