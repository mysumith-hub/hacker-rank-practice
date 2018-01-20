package algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int fine = 0;
		int actualDate = scanner.nextInt();
		int actualmonth = scanner.nextInt();
		int actualyear = scanner.nextInt();
		
		int date = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		
		if(actualyear>year){
			fine +=10000;
		}else if (actualmonth>month){
			fine +=500*(actualmonth-month);
		}else if(actualDate>date && actualmonth>=month && actualyear>=year)
			fine +=15*(actualDate-date);
		System.out.println(fine);
		
		scanner.close();
	}

}
