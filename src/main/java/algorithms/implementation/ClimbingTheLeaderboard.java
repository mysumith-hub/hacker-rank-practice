package algorithms.implementation;

import java.util.Scanner;

public class ClimbingTheLeaderboard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] scoreBoard = new int[size];
		int[] rankings = new int[scoreBoard.length];
		int rankCal = 1;
		scoreBoard[0] = scanner.nextInt();
		rankings[0] = rankCal;
		for(int j=1;j<scoreBoard.length;j++){
			scoreBoard[j] = scanner.nextInt();
			if(scoreBoard[j] != scoreBoard[j-1]){
				rankCal++;
			}
			rankings[j] = rankCal;
		}
		int myGames = scanner.nextInt();
//		int[] rankings = {1,1,2,3,3,4,5};
		int[] myScore = new int[myGames];
		for(int i=0;i<myGames;i++){
			myScore[i] = scanner.nextInt();
		}
		for(int i=0;i<myGames;i++){
			
			int rank = 0;
			for(int j=0;j<scoreBoard.length;j++){
				if(myScore[i]<scoreBoard[j]){
					continue;
				}else if(scoreBoard[j] == myScore[i] || myScore[i]>scoreBoard[j]){
					rank = rankings[j];
					break;
				}else{
					rank = rankings[j-1]+1;
					break;
				}
			}
			if(rank == 0){
				rank = rankings[scoreBoard.length-1]+1;
			}
			System.out.println(rank);
		}
		scanner.close();
	}

}
