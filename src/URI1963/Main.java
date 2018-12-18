package URI1963;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valueBefore = scan.nextDouble();
        double valueAfter = scan.nextDouble();
        
        double increase = ((valueAfter*100)/valueBefore)-100;
        
        System.out.printf("%.2f%%\n", increase);
    }
}