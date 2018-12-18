package URI2502;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int quantidadeCripto = scan.nextInt();
            int quantidadeFrases = scan.nextInt();

            scan.nextLine();
            String temp[] = scan.nextLine().split("");
            String temp2[] = scan.nextLine().split("");
            
            for (int i = 0; i < quantidadeFrases; i++) {
                
                String frase[] = scan.nextLine().split("");
                for (int j = 0; j < frase.length; j++) {
                    for (int k = 0; k < temp.length; k++) {
                        
                        if(frase[j].equals(temp[k].toLowerCase())){
                            frase[j] = temp2[k].toLowerCase();
                        }                        
                        else if(frase[j].equals(temp[k])){
                            frase[j] = temp2[k];
                        }
                        else if(frase[j].equals(temp2[k].toLowerCase())){
                            frase[j] = temp[k].toLowerCase();
                        }
                        else if(frase[j].equals(temp2[k])){
                            frase[j] = temp[k];
                        }
                        
                    }
                    System.out.print(frase[j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public class Cripto{
        
    }
}
