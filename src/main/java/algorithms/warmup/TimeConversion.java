package algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String time = "04:59:59AM";//scanner.next();
		
		int hours = Integer.parseInt(time.substring(0,time.indexOf(':')));
		if(time.contains("PM") && hours != 12){
			hours +=12;
		}else if(time.contains("AM") && hours == 12){
			hours = 0;
		}
		System.out.println(hours+""+time.substring(time.indexOf(':'),time.length()-2));
		scanner.close();

	}

}
