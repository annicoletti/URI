package URI2061;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int amount = scan.nextInt();
        int actions = scan.nextInt();
        for (int i = 0; i < actions; i++) {
            if(scan.next().equals("fechou")){
                amount++;
            }
            else{
                amount--;
            }
        }
        System.out.println(amount);
    }
}
