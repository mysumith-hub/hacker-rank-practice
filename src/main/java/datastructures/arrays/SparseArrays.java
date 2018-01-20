package datastructures.arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparseArrays {
	
	public static void superSolution(){
		 Scanner in = new Scanner(System.in);
	     List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
	     IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);
	     in.close();
	}
	
	public static void sparse(String[] n, String[] q){
        int[] count = new int[q.length];
        for(int i=0;i<n.length;i++){
            for(int j=0;j<q.length;j++){
                if(n[i].equalsIgnoreCase(q[j])){
                    count[j]++;
                } 
            }
        }
        for(int i=0;i<count.length;i++){
            System.out.println(count[i]);
        }
         
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            a[i] = scan.next();
        }
         int q = scan.nextInt();
        String[] qa = new String[q];
        for(int i=0;i<q;i++){
            qa[i] = scan.next();
        } 
        sparse(a,qa);
        scan.close();
    }
    
}
