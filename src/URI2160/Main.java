package URI2160;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if(text.length()<=80){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
