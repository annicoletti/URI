package URI2235;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        boolean nowadays = false;
        
        if((a-b)==0 | (a-c)==0){nowadays=true;}
        else if((b-a)==0 | (b-c)==0){nowadays=true;}
        else if((c-a)==0 | (c-b)==0){nowadays=true;}
        
        else if((a+b)==c | (a+c)==b){nowadays=true;}
        else if((b+a)==c | (b+c)==a){nowadays=true;}
        else if((c+a)==b | (c+b)==a){nowadays=true;}
        
        if(nowadays){System.out.println("S");}
        else{System.out.println("N");}
    }
}
