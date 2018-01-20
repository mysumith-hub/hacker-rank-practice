package tutorial.cracking.code;

import java.util.Scanner;

public class MakingAnagrams {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String a = scanner.next();
//		String b = scanner.next();
//		String newA = anagram(a, b);
//		String newB = anagram(b, a);
//		System.out.println((a.length()-newA.length()) + (b.length()-newB.length()) );
//		scanner.close();
//	}
//	public static String anagram(String source, String target){
//		StringBuilder str = new StringBuilder();
//		char[] sourceArray = source.toCharArray();
//		char[] targetArray = target.toCharArray();
//		for(char c : sourceArray){
//			for(int i=0;i<targetArray.length;i++){
//				if(c == targetArray[i]){
//					str.append(c);
//					targetArray[i] = 1;
//					break;
//				}
//			}
//		}
//		return str.toString();
//	}
	
	public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}

}
