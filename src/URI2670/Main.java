package URI2670;

/**
 *
 * @author NICOLETTI A.
 */

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> andar = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            andar.add(scan.nextInt());
        }
        //Testando o tempo em todos os andares
        ArrayList<Integer> testeTempo = new ArrayList<>();
        //Maquina Nadar 3
        testeTempo.add( andar.get(0)*4 + andar.get(1)*2 );
        //Maquina Nadar 2
        testeTempo.add( andar.get(0)*2 + andar.get(2)*2 );
        //Maquina Nadar 1
        testeTempo.add( andar.get(1)*2 + andar.get(2)*4 );
        
        //System.out.println(testeTempo);
        //Menor valor
        System.out.println(Collections.min(testeTempo));
    }
}
