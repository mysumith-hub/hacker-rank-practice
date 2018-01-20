package algorithms.implementation;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
		int spent = -1;
		for(int key : keyboards){
			for(int usb : drives){
				int total = key + usb;
				if((total > spent) && (total <= s)){
					spent = total;
				}
			}
		}
		in.close();
		System.out.println(spent);
	}

}
