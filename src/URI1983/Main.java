package URI1983;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double maior =0;
        double ra=0;
        double notas[][] = new double[n][2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                notas[i][j] = scan.nextDouble();
            }
        }
        
        for (int i = 0; i < notas.length; i++) {
            if(notas[i][1]>=maior){
                maior = notas[i][1];
                ra = notas[i][0];
                //System.out.println("maior: " + maior);
            }
        }
        
        if(maior<8){
            System.out.println("Minimum note not reached");
        }
        else{
            System.out.printf("%.0f\n",ra);
        }
    }
}
