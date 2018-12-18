package URI1837;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int e,f=0,q,r;
        
        if(n1<0){
            e = n2;
            if(e<0){
                e = n2*-1;
            }
            for(r=0; r<e; r++){
                f = n1 - r;
                if(f%n2==0){
                    break;
                }
            }
            q = f / n2;
        }
        else{
            q = n1 / n2;
            r = n1%n2;
        }
        
        System.out.println(q + " " + r);
    }
}
