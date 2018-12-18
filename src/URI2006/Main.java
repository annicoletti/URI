package URI2006;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        int correct = 0;
        int judge[] = new int[5]; 
        for (int i = 0; i < 5; i++) {
            judge[i] = scan.nextInt();
            if(judge[i] == answer){
                correct++;
            }
        }
        System.out.println(correct);
    }
}
