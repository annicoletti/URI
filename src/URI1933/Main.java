package URI1933;

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
        ArrayList<Integer> cards = new ArrayList<Integer>();
        cards.add(scan.nextInt());
        cards.add(scan.nextInt());
        
        Collections.sort(cards);
        
        System.out.println(cards.get(1));
    }
}
