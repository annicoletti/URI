package URI2633;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    
    public static class Carne implements Comparable<Carne>{
        
        private String nome;
        private int vencimento;
        
        public Carne(String nome, int vencimento){
            this.nome = nome;
            this.vencimento = vencimento;
        }
        
        @Override
        public int compareTo(Carne o){
            if (this.vencimento > o.vencimento){
                return 1;
            }
            else if(this.vencimento < o.vencimento){
                return -1;
            }
            else{
                return 0;
            }
        } 
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            ArrayList<Carne> lista = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                lista.add(new Carne(scan.next(), scan.nextInt()));
            }
            Collections.sort(lista);
            for (int i = 0; i < lista.size(); i++) {
                System.out.printf("%s", lista.get(i).nome);
                if(i<lista.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
            //System.out.println(lista);
        }
        scan.close();
    }
}
