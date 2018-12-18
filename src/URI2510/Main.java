package URI2510;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String name;
        for (int i = 0; i < n; i++) {
            name=scan.next();
            System.out.println((name.equals("Batman")) ? "N" : "Y");
        }
    }
}
