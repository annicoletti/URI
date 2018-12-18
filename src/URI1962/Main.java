package URI1962;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String s = "D.C.";
            long year = scan.nextInt();
            long count=2015;
            if(year>=2015){
               System.out.println(Math.abs(count-(year+1))+ " A.C."); 
            }
            else{
                System.out.println(Math.abs(count-(year))+ " D.C."); 
            }
        }
    }
}
