package URI2126;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int cases = 0;
        while (scan.hasNext()) {
        
            cases++;
            
            int qtd = 0;
            int pos = 0;
            
            String seq = scan.nextLine();
            String linha = scan.nextLine();
            
            String sequencia[] = seq.split("");
            String linhacompleta[] = linha.split("");
                
            System.out.printf("Caso #%d:\n",cases);
            if(linha.contains(seq)){
                for (int i = 0; i <= linha.length()-seq.length(); i++) {
                    String temp = "";
                    for (int j=i, c=0; c < seq.length(); j++,c++) {
                        temp += linhacompleta[j];
                        //System.out.println(temp);
                    }
                    if(temp.equals(seq)){
                        pos = i+1;
                        qtd++;
                    }
                }
                                
                System.out.println("Qtd.Subsequencias: " + qtd);
                System.out.println("Pos: " + pos + "\n");
            }
            else{
                System.out.println("Nao existe subsequencia\n");
            }
        }
    }
}
