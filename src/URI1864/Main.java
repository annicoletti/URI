package URI1864;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(phrase.charAt(i));
        }
        System.out.println();
    }
}
