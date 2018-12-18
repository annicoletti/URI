package URI2543;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int id = scan.nextInt();
            int qtd = 0;
            for (int i = 0; i < n; i++) {
                int idTemp = scan.nextInt();
                int jogo = scan.nextInt();
                if(idTemp == id && jogo == 0){
                    qtd++;
                }
            }
            System.out.println(qtd);
        }
    }
}
