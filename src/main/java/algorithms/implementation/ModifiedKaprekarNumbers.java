package algorithms.implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        start--;
        boolean isInvalid = true;
        while(start++ <end){
            if(isKaprekar(start)){
                System.out.print(start+" ");
                isInvalid = false;
            }
        }
        if(isInvalid)
              System.out.print("INVALID RANGE");
        in.close();
    }
    
    public static boolean isKaprekar(int number){
        long squre = ((long)number*(long)number);
        String str  = ""+squre;
        int digits = Math.abs(str.length()/2);
        if(str.length() - digits != digits){
            digits +=1;
        }
        int power = (int)Math.pow(10,digits);
        if(squre%power+squre/power == number){
            return true;
        }
        return false;
    }

}
