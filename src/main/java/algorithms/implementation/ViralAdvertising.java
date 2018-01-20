package algorithms.implementation;import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfDays = scanner.nextInt();
		int intialNumber = 5;
		int people = 0;
		while(numberOfDays-- > 0){
			
			int temp = Math.abs(intialNumber/2);
			people +=temp;
			intialNumber = temp * 3;
			
		}
		System.out.println(people);
		scanner.close();
	}

}
