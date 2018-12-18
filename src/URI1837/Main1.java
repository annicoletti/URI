package URI1837;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        System.out.println((n1/n2) + " " + (Math.abs(n1))%Math.abs(n2));
    }
}
