import java.util.*;
import java.io.*;

class ParkingSpots {
	
	/* DO NOT MODIFY BELOW THIS LINE */ 
    private static class Neighborhood {
	    int start;
	    int end;
	    Neighborhood() { start = 0; end = 0; }
	    Neighborhood(int s, int e) { start = s; end = e; }

	    public String toString() {
	    	return "[" + this.start + ", " + this.end + "]";
	    }
    }

    
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("ParkingSpotsIN.txt"));
		while (sc.hasNextLine()) {
			int N = sc.nextInt();
			List<Neighborhood> neighborhoods = new ArrayList<Neighborhood>();
			for (int i = 0; i < N; i++) {
				int s = sc.nextInt(), e = sc.nextInt();
				Neighborhood interval = new Neighborhood(s, e);
				neighborhoods.add(interval);
			}
			System.out.println(merge(neighborhoods));
		}
	}
	/* DO NOT MODIFY ABOVE THIS LINE*/

	public static List<Neighborhood> merge(List<Neighborhood> neighborhoods) {
    	/* YOUR CODE HERE */
    	return null;   
    }

}