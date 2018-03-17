package datastructures.arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {

    public static void getMax(int array[],List<Query> queries){
		int temp = 0;
		for(Query query : queries){
			for(int i=query.a;i<=query.b;i++){
				array[i-1] += query.k;
				if(temp<array[i-1]){
					temp = array[i-1];
				}
			}
		}
		
		System.out.println(temp);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int in = scanner.nextInt();
		long array[] = new long[size];
		List<Query> queries = new ArrayList<Query>();
		long temp = 0;
		for(int q = 0 ;q<in;q++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			long k = scanner.nextLong();
            for(int i=a;i<=b;i++){
				array[i-1] += k;
				if(temp<array[i-1]){
					temp = array[i-1];
				}
			}
			//Query query = new Query(a, b, k);
			//queries.add(query);
		}
	//	getMax(array,queries);
//		for(int i=0;i<array.length;i++){
//			System.out.print(array[i]+" ");
//		}
//		System.out.println(""); 
		System.out.println(temp); 
		scanner.close();

	}
}
class Query{
	public int a;
	public int b;
	public int k;
	public Query(int a,int b, int k){
		this.a = a;
		this.b = b;
		this.k = k;
	}
}