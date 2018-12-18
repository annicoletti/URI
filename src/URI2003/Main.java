package URI2003;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String horaio;
        String s[];
        int horas;
        int minutos;
        while(scan.hasNext()){
            horaio = scan.nextLine();
            s = horaio.split(":");
            horas = Integer.parseInt(s[0]);
            minutos = Integer.parseInt(s[1]);
                        
            System.out.printf("Atraso maximo: ");
            if(horas<7 || (horas==7 && minutos==0)){
                System.out.printf("0\n");
            }
            else{
                System.out.printf("%d\n", ((horas+1)-8)*60 + minutos);
            }
        }
        scan.close();
    }
}
