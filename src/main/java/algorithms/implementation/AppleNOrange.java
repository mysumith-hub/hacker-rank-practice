package algorithms.implementation;

import java.util.Scanner;

public class AppleNOrange {

	Scanner scanner ;
	public AppleNOrange(){
		scanner = new Scanner(System.in);
	}
	public void execute(){
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		int appleTree = scanner.nextInt();
		int orangeTree = scanner.nextInt();
		int apples = scanner.nextInt();
		int orange = scanner.nextInt();
		
		int[] appleDistance = getDistance(apples);
		int[] orangeDistnace = getDistance(orange);
		scanner.close();
		countFruits(appleDistance, start,end, appleTree);
		countFruits(orangeDistnace,start, end, orangeTree);
		
	}
	public void countFruits(int[] distance,int start,int end,int tree){
		int count = 0;
		for(int i : distance){
			int temp =tree;
			int actualDis = temp + i;
			if(actualDis >= start && actualDis<=end){
				count +=1;
			}
		}
		System.out.println(count);
	}
	
	public int[] getDistance(int numbers){
		int[] distance = new int[numbers];
		for(int i=0;i<numbers;i++){
			distance[i] = scanner.nextInt();
		}
		return distance;
	}
	public static void main(String[] args) {
		new AppleNOrange().execute();
	}

}
