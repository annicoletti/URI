package URI1557;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
        
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scan = new Scanner(System.in);
        int n, maior;
        while((n=scan.nextInt())!=0){
            int matriz[][] = new int[n][n];
            int content = 1;
            String space;
            String message = "";
            maior = 0;
            
            for(int i=0; i<n; i++){
                matriz[i][0] = content;
                content *= 2;
                maior = m.maior(maior, content);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    matriz[i][j] += matriz[i][j-1] * 2;
                    maior = m.maior(maior, matriz[i][j]);
                }
            }
            /**
             * Imprime Matriz
             */
            
            //System.out.println("MAIOR= "+ maior );
            
            for(int i=0; i<n; i++){
                String linha="";
                for(int j=0; j<n; j++){
                    if(n<3){
                        if(j==n-1){
                            linha += matriz[i][j];
                        }
                        else{
                            linha += matriz[i][j];
                            linha+=" ";  
                        }                        
                    }
                    else{
                        if(j==n-1){
                           linha += m.space(maior,matriz[i][j]);
                           linha += matriz[i][j];
                        }
                        else{
                            linha += m.space(maior,matriz[i][j]);
                            linha += matriz[i][j];
                            linha+=" ";
                        }
                    }                           
                }
                System.out.printf("%s\n",linha);
            }
            System.out.println("");
        } 
    }
    
    public String space(int biggest, int numero){
        String s = "";
        String m = String.valueOf(biggest);
        String n = String.valueOf(numero);
        int dif = m.length() - n.length();
        for(int i=0; i<dif; i++){
            s += " ";
        }
        return s;
    }
    
    public int maior(int maior, int numero){
        if(numero>maior){
            return numero;
        }
        else{
            return maior;
        }
    }    
}
