package URI1541;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1, m2, percentArea;
        while((m1=scan.nextInt())!=0){
            m2 = scan.nextInt();
            percentArea = scan.nextInt();
            
            int result =(int)Math.sqrt((double)((m1*m2)*100)/percentArea);
            System.out.println(result);
        }
    }
}
