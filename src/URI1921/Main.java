package URI1921;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long lados = scan.nextInt();
        long barbantes = lados;

        barbantes = (((barbantes-3) * lados ) / 2) ;
        
        System.out.println(barbantes);
    }
}
