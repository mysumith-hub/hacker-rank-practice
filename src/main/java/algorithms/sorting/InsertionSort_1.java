package algorithms.sorting;

import java.util.Scanner;

public class InsertionSort_1 {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int temp = ar[ar.length];
        for(int i = ar.length;i>=1;i--){
//            if(temp)
        }
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        System.out.println(ar.length);
        ar[ar.length] = 1;
        
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
