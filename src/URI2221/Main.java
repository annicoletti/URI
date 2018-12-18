package URI2221;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int B, A1, D1, L1, A2, D2, L2;
        double P1, P2;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            //Bonus
            B = scan.nextInt();
            //Dabriel
            A1 = scan.nextInt();
            D1 = scan.nextInt();
            L1 = scan.nextInt();
            
            //Guarte
            A2 = scan.nextInt();
            D2 = scan.nextInt();
            L2 = scan.nextInt();
            
            P1 = (A1 + D1) / (double)2;
            P2 = (A2 + D2) / (double)2;
            
            if((L1%2)==0){
                P1+=B;
            }
            
            if((L2%2)==0){
                P2+=B;
            }
            
            if(P1>P2){
                System.out.println("Dabriel");
            }
            else if(P1<P2){
                System.out.println("Guarte");
            }
            else{
                System.out.println("Empate");
            }            
        }
    }
}
