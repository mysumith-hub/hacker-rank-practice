package algorithms.implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
//		int[] records = {10, 5, 20, 20, 4, 5, 2, 25, 1};
//		int[] records = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int lowRecord = scanner.nextInt();
		int highestRecord = lowRecord;
		int lowCount = 0;
		int highCount = 0;
		for(int i=1;i<size;i++){
			int record = scanner.nextInt();
			if(highestRecord<record){
				highestRecord = record;
				highCount ++;
			}else if (lowRecord>record){
				lowRecord = record;
				lowCount++;
			}
		}
		scanner.close();
		System.out.println(highCount +" "+ lowCount);
	}

}
