package URI1176;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            
            int f = scan.nextInt();            
            ArrayList<Long> fib = new ArrayList<Long>(); 
            fib.add(0L);
            fib.add(1L);
            
            for (int j = 2; j <= f; j++) {
                fib.add( fib.get(j-2)+fib.get(j-1));
            }
            
            System.out.printf("Fib(%d) = %d\n", f,fib.get(f));
        }
    }
}
