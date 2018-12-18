package URI2523;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            String message = "";
            String palavras[] = scan.next().split("");
            
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                message += palavras[scan.nextInt()-1];
            }
            System.out.println(message);
        }
    }
}
