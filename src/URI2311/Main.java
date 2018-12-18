package URI2311;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author NICOLETTI A.
 */
public class Main {

    private String nome;
    private double media,dificuldade;
    private ArrayList<Double> notas;
    
    public Main(String nome, double dificuldade){
        this.nome = nome;
        this.dificuldade = dificuldade;
        notas = new ArrayList<Double>();
    }
    
    public void setNota(double nota){
        notas.add(nota);
    }
    
    public void getMedia(){
        Collections.sort(notas);
        notas.remove(notas.get(0));
        notas.remove(notas.get(notas.size()-1));
        for(int c=0; c<notas.size(); c++){
            media += notas.get(c);
        }
        //System.out.println("MEDIA = " + media);
        media *= dificuldade;
        System.out.printf("%s %.2f\n",nome,media);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();       
        Main m[] = new Main[n];
        
        for (int i = 0; i < n; i++) {
            String nome = scan.next();
            m[i] = new Main(nome, scan.nextDouble());
            for (int j = 0; j < 7; j++) {
                m[i].setNota(scan.nextDouble());
            }
            m[i].getMedia();
        }
    }    
}
