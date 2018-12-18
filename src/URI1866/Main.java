package URI1866;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),number;
        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            if(number%2!=0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
