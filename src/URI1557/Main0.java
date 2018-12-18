package URI1557;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, p=1;
        while((n=scan.nextInt())!=0){
            int matriz[][] = new int[n][n];
            for(int i=0,l=1; i<n; i++,l++){
                for(int j=0,c=1; j<n; j++,c++){
                    matriz[i][j] = l*c;
                }
            }        
            /**
             * Imprime Matriz
             */        
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.printf("%5d",matriz[i][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        }   
    }
}
