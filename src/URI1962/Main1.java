package URI1962;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String s = "D.C.";
            long year = scan.nextInt();
            long count=2015;
            for( int j=0; j<year; j++){
                count--;
                if(count==0){
                    count--;
                    s = "A.C.";
                }
            }
            System.out.println(Math.abs(count) + " " + s);
        }
    }
}
