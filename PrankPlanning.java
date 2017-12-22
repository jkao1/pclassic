import java.util.*;
import java.io.*;

class PrankPlanning {
	
	/* DO NOT MODIFY BELOW THIS LINE */
	public static void main(String[] args) throws FileNotFoundException {
			
		Scanner sc = new Scanner(new FileReader("PrankPlanningIN.txt"));
		while (sc.hasNext()) {
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				System.out.println(reverse(sc.next()));
			}
		}
	}
	/* DO NOT MODIFY ABOVE THIS LINE */

	public static String reverse(String s) {
		/* YOUR CODE HERE */ 
		return "";
	}

}