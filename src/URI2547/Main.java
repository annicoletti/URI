package URI2547;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int tourists = scan.nextInt();
            int min = scan.nextInt();
            int max = scan.nextInt();
            int sum = 0;
            for (int i = 0; i < tourists; i++) {
                double t = scan.nextInt();
                if(t>=min && t<=max){
                    sum++;
                }
            }
            System.out.println(sum);
        }
        scan.close();
    }
}
