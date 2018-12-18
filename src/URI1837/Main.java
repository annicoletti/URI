package URI1837;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,e,f=0,q,r;
        a = scan.nextInt();
        b = scan.nextInt();
        
        if(a<0)
        {
            e=b;
            if(b<0){
                e=b*-1;
            }
            for(r=0; r<e; r++)
            {
                f=a-r;
                if(f%b==0){
                    break;
                }
            }
            q=f/b;
        }
        else
        {
            q=a/b;
            r=a%b;
        }
        System.out.printf("%d %d\n",q,r);        
    }
}
