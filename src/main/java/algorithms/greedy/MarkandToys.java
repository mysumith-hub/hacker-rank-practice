package algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarkandToys {
	 static int maximumToys(int[] prices, int k) {
         Arrays.sort(prices);
         int total = 0;
         int count = 0;
         for(int i=0;i<prices.length;i++){
             total +=prices[i];
             if(total<=k){
                 count++;
             }else{
                 break;
             }
         }
        return count; 
 }
 
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int k = in.nextInt();
     int[] prices = new int[n];
     for(int prices_i = 0; prices_i < n; prices_i++){
         prices[prices_i] = in.nextInt();
     }
     int result = maximumToys(prices, k);
     System.out.println(result);
     in.close();
 }
}
