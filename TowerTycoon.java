import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Tristrum on 11/14/17.
 */
public class TowerTycoon {

    static List<String> tower(int numberOfLists, String[][] inhabitantList) {
        //YOUR CODE HERE
        List<String> list = new LinkedList<String>();
        return list;
    }

    //DO NOT MODIFY BELOW THIS LINE
    public static void main(String[] args) throws IOException {
        HashMap<String, List<String>> vertexMap = new HashMap<>();
        Scanner sc = new Scanner(new FileReader("TowerTycoonIN.txt"));
        while(sc.hasNext()) {
            int numberOfLists = Integer.parseInt(sc.nextLine());
            String[][] inhabitantList = new String[numberOfLists][];
            for (int i = 0; i < numberOfLists; i++) {
                String line = sc.nextLine();
                String[] inhabitants = line.split(" ");
                inhabitantList[i] = inhabitants;
            }
            System.out.println(tower(numberOfLists, inhabitantList));
        }
        sc.close();

    }
}
