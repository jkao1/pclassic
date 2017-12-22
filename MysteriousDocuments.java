import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MysteriousDocuments {
  private static String identifyLanguage(String document) {
    // TODO: implement this method!
    return "English";
  }

  /* DO NOT MODIFY BELOW THIS LINE */

  // Before submitting, make sure the main method hasn't been changed!
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("MysteriousDocumentsIN.txt"));
    while (br.ready()) {
      String data = br.readLine();
      if (data.length() == 0) {
        break;
      }
      System.out.println(identifyLanguage(data));
    }
    br.close();
  }
  /* DO NOT MODIFY ABOVE THIS LINE */
}
