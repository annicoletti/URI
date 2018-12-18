package URI1865;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        String name, thor = "Thor";
        for (int i = 0; i < cases; i++) {
            name = scan.next(); 
            scan.next(); //lixo
            if(name.equals(thor)){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }      
    }
}
