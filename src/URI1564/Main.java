package URI1564;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r;
        while(scan.hasNext()){
            r=scan.nextInt();
            if(r>0){
                System.out.println("vai ter duas!");
            }
            else{
                System.out.println("vai ter copa!");
            }
        }
        scan.close();
    }
}
