package URI2720;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main1 {
    
    public static class Presente implements Comparable<Presente>{
        
        private long id;
        private int volume;
        
        public Presente(long id, int h, int w, int l){
            this.id = id;
            this.volume = (h*w*l);
        }

        @Override
        public int compareTo(Presente p) {
            if(this.volume < p.volume){
                return 1;
            }
            else if(this.volume > p.volume){
                return -1;
            }
            else{
                if(this.id > this.id){
                    return 1;
                }
                else{
                    return -1;
                }
            }
            //return 0;
        }

        @Override
        public String toString(){
            //return Integer.toString(id);
            return "\nId: " + id + "\nVolume: " + volume;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int total = scan.nextInt();
            int ganhar = scan.nextInt();
            ArrayList<Presente> saco = new ArrayList<>();            
            ArrayList<Long> escolhidos = new ArrayList<>();
            for (int j = 0; j < total; j++) {
                saco.add(new Presente(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()));               
            }
            Collections.sort(saco);
            for (int j = 0; j < ganhar; j++) {
                escolhidos.add(saco.get(j).id);
            }
            String resposta = "";
            for (int j = 0; j < escolhidos.size(); j++) {
                resposta += Long.toString(escolhidos.get(j));
                if(j<ganhar-1){
                    resposta += " ";
                }
            }
            System.out.println(resposta);
            //System.out.println(escolhidos);
        }
    }
}
