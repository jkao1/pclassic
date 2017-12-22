import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StressfulPark {

	/* DO NOT MODIFY BELOW THIS LINE */
	public static void main(String[] args) throws FileNotFoundException {
		
		 Scanner fileInput = new Scanner(new File("StressfulParkIN.txt"));
		 
		 while(fileInput.hasNext()) {

			 String inputStr = fileInput.nextLine().trim();
			 String[] inputStrArr = inputStr.split(" ");
			 int N = Integer.parseInt(inputStrArr[0]);
			 int M = Integer.parseInt(inputStrArr[1]);
			 
			 int[][] parkGrid = new int[N][M];
			 
			 for(int i = 0; i < N; i++) {
				 String[] nextRow = fileInput.nextLine().trim().split(" ");
				 
				 for(int j = 0; j < M; j++) {
					 parkGrid[i][j] = Integer.parseInt(nextRow[j]);
				 }
			 }
			 
			 System.out.println(shortestTimeToExit(parkGrid));
			 
		 }
	     fileInput.close();
		 
	}
	/* DO NOT MODIFY ABOVE THIS LINE*/
	
	public static int shortestTimeToExit(int[][] parkGrid) {
		/* YOUR CODE HERE */
        return helper(parkGrid, 0);
	}
	
    public static int arraySum(int[][] arr) {
        int n = 0; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                n += arr[i][j];
            }
        }
        return n;
    }
    public static void print2d(int[][] ary) {
        String output = "";
        for (int[] a : ary) {
            for (int i : a) {
                output += i + " ";
            }
            output += "\n";
        }
        System.out.println(output);
    }
    public static int helper(int[][] parkGrid, int n) {
        int r = parkGrid.length;
        int c = parkGrid[0].length;
        if (r == 1 || c == 1) {
            return n + arraySum(parkGrid) - parkGrid[0][0];
        }
        int [][] bottom = new int[r-1][c];
        int [][] right = new int[r][c-1];
        for (int i = 1; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bottom[i-1][j] = parkGrid[i][j];
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                right[i][j-1] = parkGrid[i][j];
            }
        } 
        return Math.min(helper(bottom, n + bottom[0][0]), helper(right, n + right[0][0]));
    }
}
