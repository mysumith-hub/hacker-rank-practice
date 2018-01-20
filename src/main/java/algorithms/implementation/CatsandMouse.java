package algorithms.implementation;

import java.util.Scanner;

public class CatsandMouse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CatsandMouse catsandMouse = new CatsandMouse();
		int queries = scanner.nextInt();
		String[] winner = new String[queries]; 
		for(int i=0;i<queries;i++){
			int catA = scanner.nextInt();
			int catB = scanner.nextInt();
			int mouse = scanner.nextInt();
			int catADistance = catsandMouse.distance(catA, mouse);
			int catBDistance = catsandMouse.distance(catB, mouse);
			winner[i]=catsandMouse.getAnimal(catADistance, catBDistance);
		}
		for(String win : winner){
			System.out.println(win);	
		}
		
		scanner.close();
	}
	public int distance(int cat, int mouse){
		int distance=0;
		if(mouse<=cat){
			distance=cat-mouse;
		}else{
			distance=mouse-cat;
		}
		return distance;
	}
	public String getAnimal(int catA, int catB){
		if(catA<catB){
			return "Cat A";
		}else if(catA>catB){
			return "Cat B";
		}else{
			return "Mouse C";
		}
	}
}

