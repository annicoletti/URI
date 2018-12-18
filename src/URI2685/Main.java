package URI2685;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            
            if (n<0){
                
            }
            else if(n<90){
                System.out.println("Bom Dia!!");
            }
            else if(n<180){
                System.out.println("Boa Tarde!!");
            }
            else if(n<270){
                System.out.println("Boa Noite!!");
            }
            else if(n <360 ){
                System.out.println("De Madrugada!!");
            }
            else if(n == 360){
                System.out.println("Bom Dia!!");
            }
        }
    }
}
