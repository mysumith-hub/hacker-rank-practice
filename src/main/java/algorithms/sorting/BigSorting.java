package algorithms.sorting;

import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {

	public static String[] sort(String[] s) {

		Comparator<String> comparator = (s1, s2) -> {
			if (s1.length() == s2.length()) {
				s2.compareTo(s1);
//				for (int i = 0; i < s1.length(); i++) {
//					int j = Integer.parseInt("" + s1.charAt(i));
//					int k = Integer.parseInt("" + s2.charAt(i));
//					if (j != k) {
//						if (j > k) {
//							return 1;
//						} else {
//							return -1;
//						}
//					}
//
//				}
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return -1;
		};
		String temp = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				if (1 == comparator.compare(s[j], s[j + 1])) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			unsorted[unsorted_i] = in.next();
		}
		unsorted = sort(unsorted);
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			System.out.println(unsorted[unsorted_i]);
		}

		in.close();
	}

}
