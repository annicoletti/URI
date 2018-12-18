package URI2635;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    
    public static class Palavra implements Comparable<Palavra>{
        private String palavra;
        private int comprimento;
        public Palavra(String palavra){
            this.palavra = palavra;
            this.comprimento = palavra.length();
        }
        
        @Override
        public int compareTo(Palavra o){
            if(this.comprimento < o.comprimento){
                return 1;
            }
            else if(this.comprimento > o.comprimento){
                return -1;
            }
            return 0;
        }
        
        @Override
        public String toString(){
            return ""+comprimento; 
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Palavra> palavras = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            palavras.add(new Palavra(scan.next()));            
        }
        
        n = scan.nextInt();        
        for (int i = 0; i < n; i++) {
            int finded = 0;
            ArrayList<Palavra> temp = new ArrayList<>();
            String s = scan.next();
            for (int l = 0; l<palavras.size(); l++) {
                if(palavras.get(l).palavra.contains(s)){
                    finded++;
                    temp.add(palavras.get(l));
                    //System.out.println(palavras.get(l).palavra +" "+ palavras.get(l).comprimento);
                }            
            }
            if(finded == 0){
                System.out.println("-1");
            }
            else{
                Collections.sort(temp);
                System.out.println(finded +" "+ temp.get(0));
            }
            temp.clear();
        }
        
        //Collections.sort(palavras);
        //System.out.println(palavras);
    }
}
