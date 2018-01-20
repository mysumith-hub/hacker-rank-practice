package algorithms.implementation;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long n = in.nextLong();
		int number = s.length();
		char[] ch = s.toCharArray();
		int count = 0;

		for (char c : ch) {
			if (c == 'a') {
				count++;
			}
		}

		long circle = (long) n / number;

		long repeats = circle * count;

		for (int i = 0; i < (n - circle * number); i++) {

			if (ch[i] == 'a') {
				repeats++;
			}
		}
		System.out.println(repeats);
		in.close();
	}

}
