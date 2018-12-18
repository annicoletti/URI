package URI1827;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            
            int n = scan.nextInt();
            int matriz[][] = new int[n][n];
            
            //MATRIZ ZERADA
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    matriz[i][j] =0;
                }
            }
            
            //DIAGONAL PRINCIPAL
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==j){
                        matriz[i][j] = 2;
                    }                    
                }
            }
            
            //DIAGONAL SECUNDÁRIA
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((i+j)==n-1){
                        matriz[i][j] = 3;
                    }                    
                }
            }
            
            //QUADRADO DE 1
            int p = n/3;
            for(int i=p; i<n-p; i++){
                for(int j=p; j<n-p; j++){
                    matriz[i][j] = 1;                  
                }
            }
            
            //PONTO CENTRAL
            if(n%2!=0){
                int centro = n/2;
                matriz[centro][centro] = 4;
            }
            
            /* Imprime matriz */
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.printf("%d ",matriz[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
