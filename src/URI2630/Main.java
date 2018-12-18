package URI2630;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static int n,i;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (i = 0; i < n; i++) {
            GrayScale(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
        }
    }
    
    public static void GrayScale(String s, int R, int G, int B){
        int P=0;
        if(s.equals("eye")){
            P = (int)(0.30*R+0.59*G+0.11*B);
        }
        else if(s.equals("mean")){
            P = (int)((R+G+B)/3);
        }
        else if(s.equals("min")){
            ArrayList<Integer> lista = new ArrayList<Integer>();
            lista.add(R);
            lista.add(G);
            lista.add(B);
            P = Collections.min(lista);
        }
        else if(s.equals("max")){
            ArrayList<Integer> lista = new ArrayList<Integer>();
            lista.add(R);
            lista.add(G);
            lista.add(B);
            P = Collections.max(lista);
        }
        System.out.printf("Caso #%d: %d\n", (i+1), P );
    }    
}
