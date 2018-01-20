package algorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int birds[] = new int[n];
//		for(int i=0;i<n;i++){
//			birds[i] = scanner.nextInt();
//		}
//		
//		int count = 0;
//		int number = 0;
//		String skip = "";
//		for(int i=0;i<birds.length;i++){
//			
//			int tempCount = 0;
//			if(skip.contains(""+birds[i])){
//				continue;
//			}
//			for(int j=i;j<birds.length;j++){
//				if(birds[i] == birds[j]){
//					tempCount +=1;
//				}
//			}
//			skip +=","+birds[i];
//			if(tempCount>count || (tempCount == count && birds[i] < number)){
//				count = tempCount;
//				number = birds[i];
//			}
//		}
////		System.out.println(count+" : "+number);
//		System.out.println(number);
//		scanner.close();
//	}
	
	public static void main(String[] args) {
        
        
        int[] types ={6,4,4,4,3,5,2,2,2,1,1,1};
        
        int[] frequencies = new int[types.length]; //A
        for (int i = 0; i < types.length; i++) { //B
            frequencies[types[i]] += 1; //C
        }
        int mostCommon = 0;
        for (int i = 1; i < frequencies.length; i++) { //D
            if (frequencies[mostCommon] < frequencies[i]) {
                mostCommon = i; //E
            }
        }
        System.out.println(mostCommon);
    }

}
