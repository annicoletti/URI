package URI1858;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        ArrayList<Integer> listaTemp = new ArrayList<Integer>();
        String temp[];
        scan.nextLine(); //lixo;
        String s = scan.nextLine();
        
        temp = s.split(" ");
        for(int i=0; i<temp.length; i++){
            lista.add(Integer.parseInt(temp[i])); 
            listaTemp.add(Integer.parseInt(temp[i])); 
        }
        
        Collections.sort(listaTemp);
        int menor = listaTemp.get(0);
        
        
        System.out.println(lista.indexOf(menor)+1);
        
//        System.out.println("menor n = " + menor);
//        System.out.println("normal = " + lista);
//        System.out.println("ordenado = " + listaTemp);
    }
}
