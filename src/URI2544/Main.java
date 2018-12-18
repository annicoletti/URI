package URI2544;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int total = 0;
            while(n>1){
                total++;
                n-=2;        
            }
            System.out.println(total);
        }
        scan.close();
    }
}
