package datastructures.arrays;

//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
//Result 19

//-1 -1 0 -9 -2 -2
//-2 -1 -6 -8 -2 -5
//-1 -1 -1 -2 -3 -4
//-1 -9 -2 -4 -4 -5
//-7 -3 -3 -2 -9 -9
//-1 -3 -1 -2 -4 -5
//Result -6
import java.util.Scanner;

public class Array2D {

	 /** Given a starting index for an hourglass, sets maxHourglass
	    *   @param i row 
	    *   @param j column 
	    **/
	private static final int _MAX = 6; // size of matrix
    private static final int _OFFSET = 2; // hourglass width
    private static int matrix[][] = new int[_MAX][_MAX];
    private static int maxHourglass = -63; // initialize to lowest possible sum (-9 x 7)
    
    	private static void run(int array[][]){
    		matrix = array;
    		for(int i=0; i < _MAX - _OFFSET; i++){
                for(int j=0; j < _MAX - _OFFSET; j++){
                    hourglass(i, j);
                }
            }
    	}
	    private static void hourglass(int i, int j){
	        int tmp = 0; // current hourglass sum
	        
	        // sum top 3 and bottom 3 elements
	        for(int k = j; k <= j + _OFFSET; k++){
	            tmp += matrix[i][k]; 
	            tmp += matrix[i + _OFFSET][k]; 
	        }
	        // sum middle element
	        tmp += matrix[i + 1][j + 1]; 
	        
	        if(maxHourglass < tmp){
	            maxHourglass = tmp;
	        }
	    }
	 public static void Hourglasses( int array[][]){
	        int counter = -100;
	        int tempCounter = 0;
	        for(int i=0;i<4;i++){
	            for(int k=0;k<4;k++){
	                for(int j=i;j<i+3;j++){
	                      for(int m=k;m<k+3;m++){
	                             //System.out.print(array[j][m]+" ");
	                          if((j ==i+1 && m==k) || ( j==i+1 && m==k+2)){
	                           //   System.out.println("Checkng::"+i+"+"+m);
	                              continue;
	                          }
	                          tempCounter +=array[j][m];
	                      }
	                     
	                }                   
	              //System.out.println(tempCounter+"");
	                if(tempCounter > counter){
	                    counter = tempCounter ;
	                }
	                tempCounter = 0;
	                //System.out.println("--------");
	            }
	        }
	          System.out.println(counter);
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int array[][] = new int[6][6];
	       for(int i=0;i<6;i++){
	            for(int j=0;j<6;j++){
	                  array[i][j] = scanner.nextInt();
	            }   
	       }
	        Hourglasses(array);
	        
	        scanner.close();
	    }
}
