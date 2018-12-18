package URI2152;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int h  = scan.nextInt();
            int m  = scan.nextInt();
            int io = scan.nextInt();
            if(io==1){s = "abriu";}
            else{s = "fechou";}
            System.out.printf("%02d:%02d - A porta %s!\n", h,m,s);
        }
    }
}
