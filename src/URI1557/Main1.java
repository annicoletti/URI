package URI1557;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
        
    public static void main(String[] args) {
        Main1 m = new Main1();
        Scanner scan = new Scanner(System.in);
        int n;
        while((n=scan.nextInt())!=0){
            int matriz[][] = new int[n][n];
            int content = 1;
            String space = m.space(n);
            String message = "";
            
            for(int i=0; i<n; i++){
                matriz[i][0] = content;
                content *= 2;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    matriz[i][j] += matriz[i][j-1] * 2;
                }
            }
            /**
             * Imprime Matriz
             */        
            for(int i=0; i<n; i++){
                String linha="";
                for(int j=0; j<n; j++){
                    linha += space + matriz[i][j];
                }
                System.out.printf("%s\n",linha);
            }
            System.out.println("");
        } 
    }
    
    public String space(int QtdSpaceDoYouWant){
        String s = "";
        for(int i=0; i<QtdSpaceDoYouWant; i++){
            s += " ";
        }
        return s;
    }
    
}
