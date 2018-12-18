package URI2534;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int citzen = scan.nextInt();
            int query = scan.nextInt();
            ArrayList<Integer> grade = new ArrayList<Integer>();
            for (int i = 0; i < citzen; i++) {
                grade.add(scan.nextInt());
            }
            Collections.sort(grade);
            Collections.reverse(grade);
            //System.out.println(grade);
            for (int i = 0; i < query; i++) {
                System.out.println(grade.get(scan.nextInt()-1));
            }
            
        }
    }
}
