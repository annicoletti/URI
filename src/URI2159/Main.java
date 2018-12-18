package URI2159;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        
        //before
        double b = n / Math.log(n);
        
        //after
        double a = 1.25506 * n / Math.log(n);
        
        System.out.printf("%.1f %.1f\n", b,a);
        
    }
}
