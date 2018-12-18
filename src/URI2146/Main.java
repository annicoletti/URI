package URI2146;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int code;
        while(scan.hasNext()){
            code = scan.nextInt();
            System.out.println(code-1);
        }
    }
}
