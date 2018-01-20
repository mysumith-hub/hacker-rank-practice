package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BigInteger items[] = new BigInteger[5];
		for(int i=0;i<5;i++){
			items[i] = new BigInteger(""+ scanner.nextLong());
		}
		items = sort(items);
		BigInteger sum = new BigInteger("0");
		for(int i=0;i<items.length-1;i++){
			sum = sum.add(items[i]); 
			
		}
		System.out.print(sum.longValue());
		sum = new BigInteger("0");
		for(int i=items.length-1;i>0;i--){
			sum = sum.add(items[i]); 
		}
		System.out.print(" "+sum);
		scanner.close();
	}
	
	public static BigInteger[] sort(BigInteger[] items){
		
		for(int i=0;i<items.length;i++){
			for(int j=0;j<items.length-1;j++){
				if(items[j].longValue() > items[j+1].longValue()){
					BigInteger temp = items[j];
					items[j] = items[j+1];
					items[j+1] = temp;
				}
			}
		}
		
		return items;
	}
	
	 public static void doMaxMin() {
		 long[] test = {256741038, 623958417, 467905213, 714532089, 938071625};
		 long max = 0;
		 
		 for(int i=0;i<test.length;i++){
			 System.out.println(test[i]);
				max += test[i];
		 }
		 long sum = 0;
		 for(long temp : test){
			 sum += temp;
//			 System.out.println(sum);
		 }
		 System.out.println(max);
		 System.out.println(sum);
//		 long sum = 0;
//		 long add = 2 + 3 + 4 +1;
//		 System.out.println(add);
//		 for(long temp : test){
//			 sum += temp;
//			 System.out.println(sum);
//		 }
//		 
//	        Scanner scan = new Scanner(System.in);
//	        long sum = 0;
//	        long min = 1000000000;
//	        long max = 0;
//	        int i=0;
//	        while(i++ < 5) {
//	            long n = scan.nextLong();
//	            sum = sum + n;
//	            if (min > n) {
//	                min = n;
//	            }
//	            if (max < n) {
//	                max = n;
//	            }
//	        }
//	        scan.close();
//	        
//	        System.out.println((sum - max) + " " + (sum - min));
	    }
}
