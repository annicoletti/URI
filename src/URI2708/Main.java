package URI2708;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pessoas = 0;
        int jipes = 0;
        while(scan.hasNext()){
            String io = scan.next();
            switch(io){
                case "SALIDA" : {
                    pessoas += scan.nextInt();
                    jipes++;
                    break;
                }
                case "VUELTA" : {
                    pessoas -= scan.nextInt();
                    jipes--;
                    break;
                }
                case "ABEND" : {
                    System.out.println(pessoas);
                    System.out.println(jipes);
                    System.exit(0);
                    break;
                }
            }
        }
        scan.close();
    }
}
