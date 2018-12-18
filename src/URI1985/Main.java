package URI1985;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double amount =0;
        for (int i = 0; i < n; i++) {
            int op = scan.nextInt();
            int qtd = scan.nextInt();
            if(op == 1001){
                amount += (qtd * 1.5);
            }
            else if(op == 1002){
                amount += (qtd * 2.5);
            }
            else if(op == 1003){
                amount += (qtd * 3.5);
            }
            else if(op == 1004){
                amount += (qtd * 4.5);
            }
            else if(op == 1005){
                amount += (qtd * 5.5);
            }
        }
        System.out.printf("%.2f\n", amount);
    }
}
