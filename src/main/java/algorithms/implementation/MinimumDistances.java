package algorithms.implementation;

import java.util.Scanner;

public class MinimumDistances {
    public static int minDistance(int[] array){
        int min = array.length;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    min = Math.min(Math.abs(i-j),min);
                }
           }
        }
        if(min ==  array.length){
            min = -1;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        System.out.println(minDistance(A));
        in.close();
        
    }

}
