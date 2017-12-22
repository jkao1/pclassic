import java.io.*;
import java.util.*;

class Pattern {
	
	/* DO NOT MODIFY BELOW THIS LINE */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("PatternMatchIN.txt"));
		while (sc.hasNext()) {
			String line = sc.nextLine();
			String strings[] = line.split(",");
			System.out.println(match(strings[0], strings[1]) ? "True" : "False");
		}
	}
	/* DO NOT MODIFY ABOVE THIS LINE */

	public static boolean match(String string, String pattern) {
	  	/* YOUR CODE HERE */
	  	return false;
	}

}