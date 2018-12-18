package URI2646;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static class Letras{
        private String a,b;
        public Letras(String a, String b){
            this.a = a;
            this.b = b;
        }       
        @Override
        public String toString(){
            return a +" "+ b;
        }
    }
    
    public static class Frases{
        private String frase1, frase2;
        public Frases(String frase1, String frase2){
            this.frase1 = frase1;
            this.frase2 = frase2;
        }
        
        @Override
        public String toString(){
            return frase1 +" "+ frase2;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Letras> letras = new ArrayList<>();
        ArrayList<Frases> frases = new ArrayList<>();
        int duplas = scan.nextInt();
        int nfrases = scan.nextInt();
        for (int i = 0; i < duplas; i++) {
            letras.add(new Letras(scan.next(), scan.next()));
        }
        for (int i = 0; i < nfrases; i++) {
            frases.add(new Frases(scan.next(), scan.next()));
        }
        for (int i = 0; i < frases.size(); i++) {
            if(frases.get(i).frase1.equals(frases.get(i).frase2)){
                System.out.println("yes");
            }
            else if(frases.get(i).frase1.length() > frases.get(i).frase2.length() ||
                    frases.get(i).frase1.length() < frases.get(i).frase2.length()){
                System.out.println("no");
            }
            else{
                String a1[] = frases.get(i).frase1.split("");
                String b1[] = frases.get(i).frase2.split("");
                for (int j = 0; j < a1.length; j++) {
                    if(!a1[j].equals(b1[j])){
                        //System.out.println("d " + a1[j] + " " + b1[j] + " " + letras);
                        if(!compareAandB(letras, a1[i], b1[i])){
                            System.out.println("no");
                            //System.out.println("here");
                            j = a1.length;
                        }
                    }
                    System.out.println("yes");
                }
            }
        }
        //System.out.println(letras);
        //System.out.println(frases);
    }
    
    public static boolean compareAandB(ArrayList<Letras> l, String a, String b){
        boolean saida = false;
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i).equals(a) && l.get(i).b.equals(b)){
                System.out.println(l.get(i).equals(a)+ " " +l.get(i).b.equals(b));
                saida = true;
                break;
            }
        }
        return saida;
    }
    
}
