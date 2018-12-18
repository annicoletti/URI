package URI2542;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    public static int atributos;
    public static int cartasMarcos;
    public static int cartasLeonardo;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            atributos = scan.nextInt();
            cartasMarcos = scan.nextInt();
            cartasLeonardo = scan.nextInt();
            
            int deckMarcos[][] = new int[cartasMarcos][atributos];
            int deckLeonardo[][] = new int[cartasLeonardo][atributos];
            
            for (int i = 0; i < cartasMarcos; i++) {
                for (int j = 0; j < atributos; j++) {
                    deckMarcos[i][j] = scan.nextInt();
                }
            }
                        
            for (int i = 0; i < cartasLeonardo; i++) {
                for (int j = 0; j < atributos; j++) {
                    deckLeonardo[i][j] = scan.nextInt();
                }
            }
            
            int cartaMarcos = scan.nextInt()-1;
            int cartaLeonardo = scan.nextInt()-1;
            int sorteio = scan.nextInt()-1;
            
            if(deckMarcos[cartaMarcos][sorteio] > deckLeonardo[cartaLeonardo][sorteio]){
                System.out.println("Marcos");
            }
            else if(deckMarcos[cartaMarcos][sorteio] < deckLeonardo[cartaLeonardo][sorteio]){
                System.out.println("Leonardo");
            }
            else{
                System.out.println("Empate");
            }
        }
    }
}
