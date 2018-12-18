package URI2176;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String t = scan.nextLine();
        String bits[];
        int n=0;
        //long bits[] = new long[t.length()];
        bits = t.split("");
        for (int i = 0; i < bits.length; i++) {
            //System.out.println(bits[i]);
            if(bits[i].equals("1")){
                //System.out.println("ok");
                n++;
            }
        }

        if(n%2==0){
            t += "0";
        }
        else{
            t += "1";
        }
        
        System.out.println(t);
        //System.out.println(tamanho);
        //System.out.println(n);
    }
}
