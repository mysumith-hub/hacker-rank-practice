package algorithms.implementation;

import java.util.Scanner;

public class NonDivisibleSubset {
	
	public static void test(){
		System.out.println((2%2));
		System.out.println((5%2));
		System.out.println((2%2)+(5%2));
		System.exit(0);
	}
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int k = scanner.nextInt();
	        int[] number = new int[n];
	        for(int i=0;i<n;i++){
	            number[i] = scanner.nextInt();
	        }
	            
	    

	        int size = 0;
	        for(int i=0;i<number.length;i++){
	            int tempSize = -1;
	            int[] temp = new int[number.length];
	            temp[++tempSize] = number[i];
	            for(int j=0;j<number.length;j++){
	                if(j != i){
	                    boolean isValid = verifySubset(temp,number[j],k);
	                    if(isValid){
	                       temp[++tempSize] = number[j]; 
	                    }
	                }
	            }
	            
	            if(tempSize>size){
	                size = tempSize;
	            }
	                      
	        }
	        System.out.println(size+1);
	        scanner.close();
	    }
	    public static boolean verifySubset(int[] temp, int numberCheck, int divider){
	        boolean flag= true;
	        for(int number : temp){
	            if(number != 0){
	                if((number+numberCheck) % divider == 0){
	                    flag = false;
	                }
	            }
	        }
	        return flag;
	    }
	    
	    
	public static void newMain() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int b[] = new int[k + 1];

		for (int i = 0; i < n; i++) {
			b[a[i] % k] = b[a[i] % k] + 1;
		}
		int cond = (k % 2 == 0) ? k / 2 : (k / 2) + 1;
		for (int j = 0; j < cond; j++) {
			if (b[0] != 0 && j == 0)
				count++;
			else
				count += (b[j] > b[k - j]) ? b[j] : b[k - j];
		}
		if (k % 2 == 0)
			count += 1;
		System.out.println(count);
		in.close();
	}
	    
}
