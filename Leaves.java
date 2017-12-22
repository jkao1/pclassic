import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leaves {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner fileInput = new Scanner(new File("LeavesIN.txt"));
		 
		while(fileInput.hasNext()) {

			String[] nextLine = fileInput.nextLine().split(",");
			int[] diceRolls = new int[nextLine.length];
			for(int i = 0; i < nextLine.length; i++) {
				diceRolls[i] = Integer.parseInt(nextLine[i]);
			}
			
			System.out.println(calculateLeaves(diceRolls));
		}
		
	}
	
	public static int calculateLeaves(int[] arr) {
		return 0;
	}
}
