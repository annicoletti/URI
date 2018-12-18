package URI2502;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    
    public static void getKeys(String key1, String key2, int number){
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int tamanhoEnigma = scan.nextInt();
            int quantidadeFrases = scan.nextInt();
            //scan.next();
            scan.reset();
            String l1; //= scan.nextLine();
            String l2; //= scan.nextLine();
            l1 = scan.next();
            l2 = scan.next();
            
            System.out.println(l1+l2);
            
            String chave1[] = (l1+l2).split("");
            String chave2[] = (l2+l1).split("");
            String enigma[];
            String frase = "";
            
            ArrayList<String> itens = new ArrayList<String>();
            for (int i = 0; i < chave1.length; i++) {
                itens.add(chave1[i]);
            }
            
            for (int i = 0; i < quantidadeFrases; i++) {
                enigma = scan.next().split("");
                
                for (int j = 0; j < enigma.length; j++) {
                    
                    if(itens.contains(chave1[j])){
                        
                    }
                }                
            }
            System.out.println();
       }
    }
}
