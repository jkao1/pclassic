import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Perfect {
  /* DO NOT MODIFY BELOW THIS LINE*/
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("PerfectIN.txt"));
      while (br.ready()) {
        System.out.println(isPerfect(Integer.parseInt(br.readLine())));
      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  /* DO NOT MODIFY ABOVE THIS LINE*/

  public static boolean isPerfect(int n) {
    // YOUR CODE HERE
    return false;
  }
}
