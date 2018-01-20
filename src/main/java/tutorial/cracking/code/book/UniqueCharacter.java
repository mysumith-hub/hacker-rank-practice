package tutorial.cracking.code.book;

public class UniqueCharacter {

	public static void main(String[] args){
//		System.out.println(containsUniqueCharacrer("sometings"));
		System.out.println(isUniqueCharacrer("sometings"));
	}
	public static boolean containsUniqueCharacrer(String word){
		boolean[] containCh = new boolean[256];
		for(int i=0;i<word.length();i++){
			int charNumber = (int)word.charAt(i);
			if(containCh[charNumber] == true){
				return true;
			}
			containCh[charNumber] = true;
		}
		
		return false;
	}
	public static boolean isUniqueCharacrer(String word){
		int checker = 0;
		for(int i = 0; i < word.length(); ++i) {
			
			int val = word.charAt(i) - 'a';
//			System.out.println(word.charAt(i)+"-"+checker+"-"+val);
			System.out.println(word.charAt(i)+"-"+val+"-"+checker);
			System.out.println((1 << val));
			System.out.println(checker & (1 << val));
			System.out.println();
			System.out.println("---");
			if ((checker & (1 << val)) > 0) 
				return false;
			checker |= (1<<val);
		}
		return true;
	}
}

