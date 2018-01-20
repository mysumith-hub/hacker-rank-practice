package algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

	static String super_reduced_string(String s){   
        String temp = "";
        boolean matchExist = false;
        do{
            matchExist = false;
                for(int i=0;i<s.length();i++){
                	
                    if(i+1 >= s.length() || (s.charAt(i) != s.charAt(i+1))){
                        temp += s.charAt(i);
                    }else{
                        matchExist = true;    
                        i++;
                    }
                }     
            s = temp;
            temp = "";
        }while(matchExist);
        return s == ""? "Empty String":s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "aaaccaddd";
//        String result = super_reduced_string(s);
//        System.out.println(result);
        in.close();
        s = "aaaccaddd";
        while (true) {
            // Used for loop termination
            int len = s.length();
            
            // "(.)" is a capturing group that captures any character
            // "\\1" is a backreference that will match the character captured by the first capturing group (i.e. the one captured by "(.)")
            s = s.replaceAll("(.)\\1", "");
            
            // If no changes were made to string, break loop
            if( s.length() == len ){
                break;
            }
        }
        System.out.println(s);
    }
}
