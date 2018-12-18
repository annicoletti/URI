package URI1929;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=0,b=0,c=0,d=0;
        boolean valid = false;
        for (int i = 0; i < 4; i++) {
            switch (i){
                case 0 : {a = scan.nextInt();break;}
                case 1 : {b = scan.nextInt();break;}
                case 2 : {c = scan.nextInt();break;}
                case 3 : {d = scan.nextInt();break;}
            }
            
        }
        
        
        if(     Math.abs(b-c) < a && a < (b+c) && Math.abs(a-c) < b && b < (a+c) && Math.abs(b-a) < c && c < (b+a)){
            valid = true;
        //    System.out.println("t1");
        }
        else if(Math.abs(b-d) < a && a < (b+d) && Math.abs(a-d) < b && b < (a+d) && Math.abs(b-a) < d && d < (b+a)){
            valid = true;
        //    System.out.println("t2");
        }
        else if(Math.abs(c-d) < a && a < (c+d) && Math.abs(a-d) < c && c < (a+d) && Math.abs(a-c) < d && d < (a+c)){
            valid = true;
        //   System.out.println("t3");
        }
        else if(Math.abs(c-d) < b && b < (c+d) && Math.abs(b-d) < c && c < (b+d) && Math.abs(b-c) < d && d < (b+c)){
            valid = true;
        //    System.out.println("t4");
        }

        if(valid){
            System.out.println("S");
        }
        else{
            System.out.println("N");
        }
        //System.out.println("a: "+a +" b: "+b +" c: "+ c +" d: "+ d + " abs " + Math.abs(b-d) );
    }
}
