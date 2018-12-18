package URI2653;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int diferentes = 0;
        while(scan.hasNext()){
            String t = scan.next();
            if(!lista.contains(t)){
                diferentes++;
            }
            lista.add(t);
        }
        scan.close();
        System.out.println(diferentes);
    }
}
