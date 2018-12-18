package URI2172;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m;
        long xp;
        while((m=scan.nextInt())!=0 | (xp=scan.nextLong())!=0L){
            System.out.println(m*xp);
        }
    }
}
