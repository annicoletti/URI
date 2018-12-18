package URI2483;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String feliz="";
        for (int i = 0; i < n; i++) {
            feliz+="a";
        }
        System.out.println("Feliz nat"+feliz+"l!");
    }
}
