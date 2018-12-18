package URI2533;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int nota,carga;
            int n = scan.nextInt();
            double resultado1 = 0;
            double resultado2 = 0;
            for (int i = 0; i < n; i++) {
                nota = scan.nextInt();
                carga = scan.nextInt();
                resultado1 += (double)(nota * carga);
                resultado2 += (double)(carga);
            }
            System.out.printf("%.4f\n", (double)(resultado1)/(resultado2*100));
        }
    }
}
