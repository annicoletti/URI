package URI1534;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n;        
        
        while(scan.hasNext()){
            n = scan.nextInt();
            int matriz[][] = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((i+j)==n-1){
                        matriz[i][j]=2;
                    }
                    else if(i==j){
                        matriz[i][j]=1;
                    }
                    else{
                        matriz[i][j]=3;
                    }
                }
            }

            /*IMPRIME MATRIZ*/
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.printf("%d", matriz[i][j]);
                }
                System.out.printf("\n");
            }
        }
        scan.close();
    }
}
