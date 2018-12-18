package URI1848;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
       
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String crow, cut = "caw caw";
        int value=0, n=0, tam=0;
        
        while(tam<3){
            crow = scan.nextLine();
            
            if(crow.equals(cut)){
                System.out.println(value);
                value=0;
                tam ++;
            }
            else{
                n = 0;
                switch (crow){
                    case "---" : {n=0;break;}
                    case "--*" : {n=1;break;}
                    case "-*-" : {n=2;break;}
                    case "-**" : {n=3;break;}
                    case "*--" : {n=4;break;}
                    case "*-*" : {n=5;break;}                    
                    case "**-" : {n=6;break;}
                    case "***" : {n=7;break;}                    
                }
                //System.out.println(n);
                value += n;
                //System.out.println(value);
            }

        }
        scan.close();
    }
}
