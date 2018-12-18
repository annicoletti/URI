package URI1914;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String player1 = scan.next();
            String option1 = scan.next();
            String player2 = scan.next();
            String option2 = scan.next();
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            
            n1 +=n2;
            
            if((n1%2)!=0){
                if(option1.equals("IMPAR")){
                    System.out.println(player1);
                }
                else{
                    System.out.println(player2);
                }
            }
            else{
                if(option1.equals("PAR")){
                    System.out.println(player1);
                }
                else{
                    System.out.println(player2);
                }
            }
        }
    }
}
