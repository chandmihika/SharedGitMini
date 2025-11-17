
import java.util.Scanner;
public class IlhaamColab{
	public static void main(String[] args){
	  	Scanner scanner = new Scanner(System.in);
	  	System.out.println("What size for square array?: ");
	  	int size = scanner.nextInt();
	  	int[][] mainSquare = createSquareArray(size);
	  }
	  public static int[][] createSquareArray(int s){
	    int[][] square = new int[s][s];
	    for(int i =0; i<s; i++){
	      for(int j = 0; j<s; j++){
	        square[i][j] = (int)(Math.random()*10)+1;
	      }
	    }
	    return square;
	  }

	  public static Integer firstEven(int[][] arr) {
	      for (int row = 0; row < arr.length; row++) {
	          for (int col = 0; col < arr[row].length; col++) {
	              int value = arr[row][col];
	              if (value % 2 == 0) {
	                  return value;
	              }
	          }
	      }
	      return null;
}

}