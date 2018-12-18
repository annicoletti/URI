package URI2203;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){            
            int Xf = scan.nextInt(); 
            int Yf = scan.nextInt(); 
            int Xi = scan.nextInt();  
            int Yi = scan.nextInt();  
            int Vi = scan.nextInt();  
            int R1 = scan.nextInt();  
            int R2 = scan.nextInt();

            double Distance = Vi * 1.5;
            double Dab = Math.sqrt(Math.pow((Xi-Xf), 2) + Math.pow((Yi-Yf), 2));

            Distance += Dab;
            if((R1+R2)>= Distance){
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
            //System.out.println("Distance = "+Distance + "\nRaio = " + (R1+R2) );
        }        
    }
}
