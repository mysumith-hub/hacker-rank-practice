package algorithms.examples;

public class Bitwise {

	public static void main(String args[]){
		int i = 8;
		int print = i>>1;
		System.out.println(print);
		System.out.println(Bitwise.solve(21, 13));
	}
	
	public static int solve(int n, int p) {
        int front = p >> 1;
//        System.out.println();
//        int back =  ((n & 1) == 1) 
//                    ? (n - p) >> 1 // odd number of pages
//                    : (n - p + 1) >> 1; // even number of pages
        int back =  ((n & 1) == 1) ? (n - p) >> 1 : (n - p + 1) >> 1;
        return Math.min(front, back);
    }
}
