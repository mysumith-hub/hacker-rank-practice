package algorithms.strings;

import java.util.Scanner;

public class CaesarCipher {

	public static int getRotationNumber(char c, int k){
		
		int nextChar = k+(int)c;
		if(c>='a' && c>122){
			nextChar = Math.abs(Math.abs(nextChar-122)-(int)c);
			
		}
		if(c<='Z' && c>90){
			nextChar = Math.abs(Math.abs(nextChar-90)-(int)c);
		}
		return (char)nextChar;
//        int count = 0;
//        while (count++<k){
//           c++;
//            if(c==91){
//                c = 65;
//            }
//             if(c==123){
//                c = 97;
//            }
//        }
//        return c;
    }
    public static void rotate(String s,int k){
        String cipher = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                c = (char)getRotationNumber(c,k);
            }
            cipher+=""+c ;
        }
        System.out.println(cipher);
    }
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        rotate(s,k);
        in.close();
        
        
    }

}
