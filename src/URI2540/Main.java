package URI2540;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int participantes = scan.nextInt();
            int votos = 0;
            for (int i = 0; i < participantes; i++) {
                if(scan.next().equals("1")){
                    votos++;
                }
            }            
            if(votos >= (participantes*((double)2/3))){
                System.out.println("impeachment");
            }
            else{
                System.out.println("acusacao arquivada");
            }
        }
    }
}
