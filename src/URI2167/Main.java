package URI2167;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first,second,n;
        
        n = scan.nextInt();
        first = scan.nextInt();
                
        for (int i = 1; i < n; i++) {
            second = scan.nextInt();
            if(second<first){
                System.out.println(i+1);
                System.exit(0);
            }
            first = second;
        }
        System.out.println(0);
    }
}
