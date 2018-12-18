package URI2147;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            word = scan.next();
            System.out.printf("%.2f\n",word.length()/(double)100);
        }
    }
}
