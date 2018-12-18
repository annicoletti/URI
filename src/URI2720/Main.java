package URI2720;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int total = scan.nextInt();
            int ganhar = scan.nextInt();
            ArrayList<String> lista = new ArrayList<>();
            
            for (int j = 0; j < total; j++) {
                
                String id = scan.next();
                String volume = setVolume(scan.nextInt(), scan.nextInt(), scan.nextInt());
                String registro = volume + "/" + id;
                lista.add(registro);
            }
            
            //
            Collections.reverse(lista);
            System.out.println(lista);
            Collections.sort(lista);
            System.out.println(lista);
        }
       
    }
    
    public static String setVolume(int a, int b, int c){
        return Integer.toString((a*b*c));
    }
}
