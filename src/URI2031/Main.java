package URI2031;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            String p1 = scan.next();
            String p2 = scan.next();
            
            if(p1.equals("pedra") && p2.equals("pedra")){
                System.out.println("Sem ganhador");
            }
            else if(p1.equals("papel") && p2.equals("papel")){
                System.out.println("Ambos venceram");
            }
            else if(p1.equals("ataque") && p2.equals("ataque")){
                System.out.println("Aniquilacao mutua");
            }
            else if(p1.equals("ataque") && p2.equals("pedra") || p1.equals("ataque") && p2.equals("papel")){
                System.out.println("Jogador 1 venceu");
            }
            else if(p2.equals("ataque") && p1.equals("pedra") || p2.equals("ataque") && p1.equals("papel")){
                System.out.println("Jogador 2 venceu");
            }
            else if(p1.equals("pedra") && p2.equals("papel")){
                System.out.println("Jogador 1 venceu");
            }
            else if(p2.equals("pedra") && p1.equals("papel")){
                System.out.println("Jogador 2 venceu");
            }
        }
    }
}
