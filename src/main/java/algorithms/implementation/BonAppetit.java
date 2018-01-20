package algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int items = scanner.nextInt();
		int declineItem = scanner.nextInt();

		int declinePrice = 0;
		int total = 0;
		for(int i=0;i<items;i++){
			int price = scanner.nextInt();
			if(i == declineItem){
				declinePrice = price;
			}
			total +=price;
		}
		int charged = scanner.nextInt();
		if(total/2 == charged){
			System.out.println(declinePrice/2);
		}else{
			System.out.println("Bon Appetit");
		}
		scanner.close();
	}
}
