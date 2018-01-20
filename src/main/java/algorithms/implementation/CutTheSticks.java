package algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] sticks = new int[length];
		int small = 1001;
		for(int i =0; i<length;i++)	{
			sticks[i] = scanner.nextInt();
			if(sticks[i]<small){
				small = sticks[i];
			}
		}
		
		while(length >= 1){
			int tempSmall = 1001;
			TempSticks tempSticks = new TempSticks();
			System.out.println(sticks.length);
			for(int i=0;i<sticks.length;i++){
				int value = sticks[i] - small;
				if(value != 0){
					tempSticks.add(sticks[i] - small);
					if(tempSmall>value){
						tempSmall = value;
					}	
				}
				
			}
			small = tempSmall;
			sticks = tempSticks.getTempSticks();
			length = sticks.length;
		}
		scanner.close();
	}
}
class TempSticks{
	int size = 0;
	int[] sticks = new int[0];
	public void add(int item){
		int[] tempSticks = new int[sticks.length+1];
		System.arraycopy(sticks, 0, tempSticks,0 ,sticks.length);
		sticks = tempSticks;
		sticks[size] = item;
		size++;
		
	}
	public int[] getTempSticks(){
		return sticks;
	}
}
