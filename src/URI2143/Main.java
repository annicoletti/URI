package URI2143;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();        
              
        while ((n = scan.nextInt()) !=0) {
            if(n%2>=0){
                System.out.printf("%d\n",(n*2-1));
            }
            else{
                System.out.printf("%d\n",(n*2-2));
            }
        }
    }
}
