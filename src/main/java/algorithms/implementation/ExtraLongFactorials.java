package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		BigInteger bigInteger = new BigInteger("1");
		do {
			bigInteger = bigInteger.multiply(new BigInteger(""+number));
		} while (number-- > 1);
	
		System.out.println(bigInteger);
		scanner.close();
	}

}
