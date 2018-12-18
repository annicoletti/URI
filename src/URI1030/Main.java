package URI1030;

/**
 *
 * @author NICOLETTI A.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static class inQueuee{
      
        private static int id;
        private int myId;
        private int valor;
        private inQueuee next;

        public inQueuee(int valor, inQueuee next) {
            this.id += 1;
            this.myId = id;
            this.valor = valor;            
        }
        
        @Override
        public String toString(){
            return this.myId + " " + this.id;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<inQueuee> circular = new ArrayList<inQueuee>();
        for (int i = 0; i < n; i++) {
            circular.add(new inQueuee(i, null));
        }
        
        System.out.println(circular);
        
    }
}
