package URI1930;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = -3;
        for (int i = 0; i < 4; i++) {
            t += scan.nextInt();
        }
        System.out.println(t);
    }
}
