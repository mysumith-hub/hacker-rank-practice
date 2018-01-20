package algorithms.strings;

public class SubString {

	
	public static void main(String args[]){
		String str1 = "oneworld";
		String str2 = "myu";
		for(int i=0;i<str1.length();i++){
			for(int j=0;j<str2.length();j++){
				if(str1.charAt(i) == str2.charAt(j)){
					System.out.println("yes");
					System.out.println(str1.charAt(i));
					System.exit(0);
				}
			}
		}
		System.out.println("NO");
	}
	
}
