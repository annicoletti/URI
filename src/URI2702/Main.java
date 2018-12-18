package URI2702;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int pa = scan.nextInt();
        int pb = scan.nextInt();
        int pc = scan.nextInt();
        
        int p = 0;
        
        if(a < pa){
            p += pa-a;
        }
        if(b < pb){
            p += pb-b;
        }
        if(c < pc){
            p += pc-c;
        }         
        System.out.println(p);
        
    }
}
