package URI2674;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int primo = 0;
            int n = scan.nextInt();
            if(n>9){
                for (int i = 1; i <= n; i++) {
                    if(n%i==0){
                        primo++;
                       // System.out.println("+1'");
                    }
                }
                String number[] = Integer.toString(n).split("");
                if(!(number.length<=1)){
                    for (int i = 0; i < number.length; i++) {
                        int x = Integer.parseInt(number[i]);
                        for (int j = 1; j <= x; j++) {
                            if(x%j==0){
                                primo++;
                                //System.out.println("+1\"");
                            }
                        }
                    }
                }
                if(primo<6){
                    System.out.println("super");
                }
                else if(primo <7){
                    System.out.println("primo");
                }
                else{
                    System.out.println("nada");
                }
                System.out.println(primo);
            }
        }
        scan.close();
    }
}
