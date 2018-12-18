package URI2551;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int dias = scan.nextInt();
            double record = 0;
            int dia=0;
            for (int i = 0; i < dias; i++) {
                double tempo = scan.nextDouble();
                double distancia = scan.nextDouble();
                tempo = distancia/tempo;
                //System.out.println("tempo: "+tempo);
                if(tempo > record){
                    record = tempo;
                    dia = i+1;
                    System.out.println(dia);
                }
            }
            //System.out.println(dia);
        }
    }
}
