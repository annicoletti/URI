package URI2544;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            System.out.println(n/2);
        }
        scan.close();
    }
}
