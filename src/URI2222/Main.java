package URI2222;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    static Scanner scan;
    static int instances, quantidadeGrupos, listaGrupo[], grupos[];
    static ArrayList<ArrayList> lists; 
    
    public static void main(String[] args) {
        
        scan = new Scanner(System.in);
        instances = scan.nextInt();
        
        for (int i = 0; i < instances; i++) {            
            
            quantidadeGrupos = scan.nextInt();
            listaGrupo = new int[quantidadeGrupos];
                        
            for (int j = 0; j < listaGrupo.length; j++) {
                grupos = new int[scan.nextInt()];
                System.out.println("GRUPOS.LENGHT = " + grupos.length);
                for (int k = 0; k < grupos.length; k++) {
                    grupos[i] = scan.nextInt();
                }
            }
            
            for (int j = 0; j < listaGrupo.length; j++) {
                for (int k = 0; k < grupos.length; k++) {
                    System.out.printf("%d ", grupos[i]);
                }
                System.out.println();
            }
        }
    }
}
