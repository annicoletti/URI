package URI2631;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int alunos,relacoes,consultas;
            alunos = scan.nextInt();
            relacoes = scan.nextInt();
            consultas = scan.nextInt();   
            Duplas duplas[] = new Duplas[relacoes];
            ArrayList<Duplas> lista = new ArrayList<Duplas>();
            for (int i = 0; i < relacoes; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                lista.add(new Duplas(a,b));
                duplas[i] = new Duplas(a,b);
            }
            for (int i = 0; i < consultas; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                for (int j = 0; j < lista.size(); j++) {
                    Relationship(lista.get(j), a, b);
                }                
            }
        }
    }
    
    public static void Relationship(Duplas d, int a, int b){
        if(d.n1 == a && d.n2 == b || d.n1 == b && d.n2 == a ){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
    }
    
    public static class Duplas{
        public int n1;
        public int n2;
        
        public Duplas(int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
        }
    }
}
