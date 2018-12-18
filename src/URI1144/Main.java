package URI1144;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n = n;
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d %d %d\n",i, i*i, i*i*i);
            System.out.printf("%d %d %d\n",i, i*i+1, i*i*i+1);
        }
    }
}
