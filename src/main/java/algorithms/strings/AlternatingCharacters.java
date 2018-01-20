package algorithms.strings;

import java.util.Scanner;

public class AlternatingCharacters {
	static int alternate(String test){
		int count = 0;
		for (int j = 0; j < test.length()-1; j++) {
            if(test.charAt(j)==test.charAt(j+1))
                count++;
          }
		
		return count;
	}
	static int alternatingCharacters(String s) {
		
		
		int countA = 0;
		int countB = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'A') {
				countA++;
			} else {
				countB++;
			}
		}
		

		int result = Math.abs(countA - countB);
		if (result == s.length()) {
			result = s.length() - 1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			int result = alternate(s);
//			int result = alternatingCharacters(s);
			System.out.println(result);
		}
		in.close();
	}
}
