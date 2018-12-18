package URI2663;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int n = scan.nextInt();
        int total = scan.nextInt();
        for (int i = 0; i < n; i++) {
            lista.add(scan.nextInt());
        }
        
        Collections.sort(lista);
        ArrayList<Integer> pass = new ArrayList<>();
        
        total--;
        //System.out.println("TOTAL> " + total);
        
        pass.add(lista.get(lista.size()-1));        
        for (int i=0, l=lista.size()-2; i<lista.size()-1; i++,l--) {
            //System.out.println(lista.get(l) + " " + lista.get(l+1) + " " +total);
            if(lista.get(l)>=lista.get(l+1) || total > 0){
                total--;
                pass.add(lista.get(l));
                //System.out.println("i: " + i +" total: " + total + " add: " + lista.get(l));
            }
            else{
                //System.out.println("PPA");
                break;
            }
        }
        
        //System.out.println(lista);
        //System.out.println(pass);
        System.out.println(pass.size());
    }
}
