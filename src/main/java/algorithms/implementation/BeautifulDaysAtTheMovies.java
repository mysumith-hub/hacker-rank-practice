package algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int divisible = scanner.nextInt();
		int beauty = 0;
		for(int day=start; day<=end;day++){
			int reverse = reverese(day);
			double value = (double)Math.abs(day-reverse)/divisible;
			if(value % 1  == 0){
				beauty++;
			}
		}
		System.out.println(beauty);
		scanner.close();
	}

	public static int reverese(int number) {
		int numberReverse = 0;
		while (number != 0) {
			numberReverse = numberReverse * 10 + number % 10;
			number /= 10;
		}

		return numberReverse;
	}
}
