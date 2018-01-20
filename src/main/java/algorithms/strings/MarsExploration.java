package algorithms.strings;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String args[]) {
		System.out.println(countChanges("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));
		Scanner in = new Scanner(System.in);
		String S = in.next();
		System.out.println(verifyMessage(S));
		in.close();
	}

	public static int verifyMessage(String message) {
		int count = 0;
		int i = 0, j = 3;
		while (j <= message.length()) {
			if (!"SOS".equalsIgnoreCase(message.substring(i, j))) {
				count++;
			}
			i = i + 3;
			j = j + 3;
		}
		return count;
	}

	public static int countChanges(String message) {
		String sos = "SOS";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != sos.charAt(i % 3))
				count++;
		}
		return count;
	}
}
