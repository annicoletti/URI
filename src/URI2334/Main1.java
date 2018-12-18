package URI2334;

/**
 *
 * @author NICOLETTI A.
 */
import java.math.BigInteger;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long p;
        //BigInteger p;
        while((p=scan.nextLong())>0){
            if(p<=0){
                System.out.println("0");
            }
            else{                
                System.out.printf("%d\n",p-1);
            }
        }
    }
}
