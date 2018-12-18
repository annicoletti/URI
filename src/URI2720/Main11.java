package URI2720;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class Main11 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int total = scan.nextInt();
            int ganhar = scan.nextInt();
            String lista[] = new String[total];
             
            for (int j = 0; j < total; j++) {                
                String id = scan.next();
                String volume = setVolume(scan.nextInt(), scan.nextInt(), scan.nextInt());
                String registro = volume + "/" + id;
                //lista[j][0] = id;
                lista[j] = registro;
            }
            
            //
            Arrays.sort(lista);
            
            for (int j = 0; j < lista.length; j++) {
                System.out.println(lista[j]);
            }
        }
       
    }
    
    public static String setVolume(int a, int b, int c){
        return Integer.toString((a*b*c));
    }
}
