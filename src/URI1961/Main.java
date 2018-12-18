package URI1961;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int salto = scan.nextInt();
        int qtdCanos = scan.nextInt();
        
        int canos[] = new int[qtdCanos];
        int posicao;
        boolean passou = true;
        
        for (int i = 0; i < canos.length; i++) {
            canos[i] = scan.nextInt();
        }
       
        for (int i = 1; i < canos.length; i++) {
            //System.out.println(Math.abs(canos[i]-posicao));
            
            if(Math.abs(canos[i]-canos[i-1]) <= salto ){
                
            }
            else{
                passou = false;
            }
        }
        
        if(passou){
            System.out.println("YOU WIN");
        }
        else{
            System.out.println("GAME OVER");
        }
    }
}
