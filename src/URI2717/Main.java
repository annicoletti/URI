package URI2717;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if((a+b)>min){
            System.out.println("Deixa para amanha!");
        }
        else{
            System.out.println("Farei hoje!");
        }
    }
}
