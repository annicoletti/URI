package URI2165;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if(text.length()<=140){
            System.out.println("TWEET");
        }
        else{
            System.out.println("MUTE");
        }
    }
}
