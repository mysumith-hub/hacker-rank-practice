package tutorial.cracking.code.book;

public class DuplicateCharacter {
	public static void main(String[] args){
		String word = "something";
		
		System.out.println(containDuplicate(word));
		removeDuplicates(word.toCharArray());
	}
	
	public static boolean containDuplicate(String word){
		
		char[] wordCh = word.toCharArray();
		
		for(int i=0;i<wordCh.length-1;i++){
			
			for(int j=i+1;j<wordCh.length;j++){
				if(wordCh[i] == wordCh[j]){
					return true;
				}
			}
		}
 		
		return false;
	}
	public static boolean isDublicate(String word){
		return false;
	}

	public static void removeDuplicates(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			int j = 1;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}

			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
			str[tail] = 0;
		}
		
		System.out.println(new String(str));
	}
		
		 
}
