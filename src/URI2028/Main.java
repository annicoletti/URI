package URI2028;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caso = 1;
        
        while(scan.hasNext()){
            //Caso 1: 1 numero
            int n = scan.nextInt();
            int qtd = 1;
            
            //Calcular tamanho lista 
            for (int i = n; i >= 1; i--) {
                qtd = i + qtd;
            }
            
            if(qtd>1){
                System.out.printf("Caso %d: %d numeros\n0", caso, qtd );
            }
            else{
                System.out.printf("Caso %d: %d numero\n0", caso, qtd );
            }

            if(qtd>1){
                int r = 1;
                for (int i = 0; i < qtd; i++) {
                    System.out.print(" ");
                    for (int j = 0; j < r ; j++, i++) {
                        System.out.print(r);
                        if(j+1 != r){
                            System.out.print(" ");
                        }
                    }
                    r++;
                }
            }
            System.out.println("\n");
            caso++;
        }
        scan.close();
    }
}
