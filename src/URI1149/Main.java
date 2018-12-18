package URI1149;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b=0;
        int X = scan.nextInt();
        int N = scan.nextInt();
        while(N<=0){
            N = scan.nextInt();
        }
        for (a = 1; a <= N ; a++) {
            b+=X;
            X++;
        }
        System.out.println(b);
    }
}
