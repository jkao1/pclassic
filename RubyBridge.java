import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RubyBridge {
    public static void main(String[] args) throws IOException {
        // Before submitting, make sure the main method hasn't been changed!
        Scanner sc = new Scanner(new FileReader("RubyBridgeIN.txt"));
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String charList = sc.next();
            char[] list = new char[n];
            for(int i = 0; i < n; i++) {
                list[i] = charList.charAt(i);
            }
            System.out.println(rubyBridge(n, list));
        }
        sc.close();
    }
    /* DO NOT MODIFY ABOVE THIS LINE */
    
    public static int rubyBridge(int n, char[] list) {
        /* YOUR CODE HERE */
        return 0;
    }
}
