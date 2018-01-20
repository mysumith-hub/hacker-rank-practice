package algorithms.implementation;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		
//		int[] socksSize = {10,10,30,20,40,30,40,30,30};
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int[] socksSize = new int[size];		
		for (int i = 0; i < size; i++) {
			socksSize[i] = scanner.nextInt();
		}
		int[] verified = new int[socksSize.length];
		int count = 0;
		for(int i=0;i<socksSize.length;i++){
			for(int j=i+1;j<socksSize.length;j++){
				
				if(verified[i] == 0 && verified[j]==0){
					if(socksSize[i] == socksSize[j]){
//						System.out.println(socksSize[i]+":"+socksSize[j]);
						count ++;
						verified[i] = 1;
						verified[j] = 1;
					}	
				}
				
			}
		}
		System.out.println(count);
		scanner.close();
	}

	 public void run(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
	        
	        while(n-- > 0) {
	            int c = scan.nextInt();
	            Integer frequency = colors.get(c);
	            
	            // If new color, add to map
	            if(frequency == null) {
	                colors.put(c, 1);
	            }
	            else { // Increment frequency of existing color
	                colors.put(c, frequency + 1);
	            }
	        }
	        scan.close();
	        
	        // Count and print the number of pairs
	        int pairs = 0;
	        for(Integer frequency : colors.values()) {
	            pairs += frequency >> 1;
	        }
	        System.out.println(pairs);
	    }
}
