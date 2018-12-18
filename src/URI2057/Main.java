package URI2057;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        i += scan.nextInt();        
        i += scan.nextInt();
        if(i>=24){
            i -= 24;
        }
        else if(i<0){
            i+=24;
        }
        System.out.println(i);
    }
}