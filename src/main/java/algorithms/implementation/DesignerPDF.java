package algorithms.implementation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DesignerPDF {

//	public static void main(String args[]) {
//		Scanner scanner = new Scanner(System.in);
//		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
//		String integer = scanner.nextLine();
//		String[] integerChar = integer.split(" ");
//		int numbers = 0;
//		for(char c = 'a' ;c<='z';c++){
//			map.put(new Character(c), new Integer(integerChar[numbers]));
//			numbers++;
//		}
//		String word = scanner.nextLine();
//		char[] wordChar = word.toCharArray();
//		int bigOne = 1;
//		int area = 0;
//		for(char ch : wordChar){
//			area ++;
//			if(map.get(new Character(ch)) > bigOne){
//				bigOne = map.get(new Character(ch));
//			}
//		}
//		
//		System.out.println(bigOne*area);
//		scanner.close();
//	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] heights = new int[26];

		for (int i = 0; i < 26; i++) {
			heights[i] = scan.nextInt();
		}
		String word = scan.next();
		scan.close();

		int rect_height = 0;

		for (int j = 0; j < word.length(); j++) {
			rect_height = Math.max(rect_height, heights[(int) word.charAt(j) - (int) 'a']);
		}

		int ans = 1 * word.length() * rect_height;
		System.out.println(ans);
	}
}
