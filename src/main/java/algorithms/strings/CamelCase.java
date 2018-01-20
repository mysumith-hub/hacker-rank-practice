package algorithms.strings;

public class CamelCase {

	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";
		int count = 1;
		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) < 97) {
				count++;
			}
		}
		System.out.println(count);
		 // use a regex matching to split the string on capital letters
        // the resulting array contains contiguous sections of lowercase letters
        String[] words = s.split("[A-Z]");
        // this works because the problem states that each word has at least 2 characters, and we know that the first character of each word is always capitalized.
        
        System.out.println(words.length);
	}

}
