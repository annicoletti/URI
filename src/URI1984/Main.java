package URI1984;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        String s[];
        String n = "";
        s = number.split("");
        
        for (int i = number.length()-1; i >= 0 ; i--) {
            n += s[i];
        }
        
        System.out.println(n);
    }
}
