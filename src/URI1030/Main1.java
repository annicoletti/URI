package URI1030;

/**
 *
 * @author NICOLETTI A.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    
    public static class inQueuee{
      
        private static int id;
        private int valor;
        private inQueuee next;
        private inQueuee thisAdress;

        public inQueuee(int valor, inQueuee next, ArrayList<inQueuee> fila) {
            this.id += 1;
            this.valor = valor;
            
            if(next.equals(null)){
                next = getFirst(fila);
            }
            else{
                this.next = next;
            }            
        }
        
        public inQueuee getFirst(ArrayList<inQueuee> fila){
            return fila.get(0);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<inQueuee> circular = new ArrayList<inQueuee>();
        for (int i = 0; i < n; i++) {
            circular.add(new inQueuee(i, null, circular));
        }
        
        System.out.println(circular);
        
    }
}
