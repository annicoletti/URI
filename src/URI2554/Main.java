package URI2554;

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
            ArrayList<String> datas = new ArrayList<String>();
            int pessoas = scan.nextInt();
            int eventos = scan.nextInt();
            boolean meeting = false;
            for (int i = 0; i < eventos; i++) {
                String s = scan.next();
                int t = 0;
                for (int j = 0; j < pessoas; j++) {
                    t += scan.nextInt();
                }
                if(t==pessoas){
                    meeting = true;
                    datas.add(s);
                }
            }
            if(meeting){
                System.out.println(datas.get(0));
            }
            else{
                System.out.println("Pizza antes de FdI");
            }
        }
        scan.close();
    }
}
