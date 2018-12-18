package URI2059;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int j1 = scan.nextInt();
        int j2 = scan.nextInt();
        int r = scan.nextInt();
        int a = scan.nextInt();
        
        if(p == 0 && ((j1+j2)%2) != 0 && r+a ==0){
            System.out.println("Jogador 1 ganha!");
        }
        else if(p == 0 && ((j1+j2)%2) == 0 && r+a ==0){
            System.out.println("Jogador 2 ganha!");
        }
        else if(p == 1 && ((j1+j2)%2) != 0 && r+a ==0){
            System.out.println("Jogador 2 ganha!");
        }
        else if(p == 1 && ((j1+j2)%2) == 0 && r+a ==0){
            System.out.println("Jogador 1 ganha!");
        }
        else if(r<=0 && a>0){
            System.out.println("Jogador 1 ganha!");
        }
        else if(r>0 && a<=0){
            System.out.println("Jogador 1 ganha!");
        }
        else if(r>0 && a>0){
            System.out.println("Jogador 2 ganha!");
        }        
    }
}
