package URI2164;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static int n;
    static double r;
    public static void main(String[] args) {
        n=scan.nextInt();
        r=(Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5);
        System.out.printf("%.1f\n",r);
    }
}
