
package URI2139;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Mainold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int m = scan.nextInt();
        int d = scan.nextInt();
        int total = 0;
                
        int mes = m;
        int dias = 31;
        boolean natal = false;
        
        
        for (int i = d, j=1; (j <=mes && natal==true); i++) {
            switch (mes){
                case 1 : dias = 31;break;
                case 2 : dias = 30;break;
                case 3 : dias = 31;break;
                case 4 : dias = 30;break;
                case 5 : dias = 31;break;
                case 6 : dias = 30;break;
                case 7 : dias = 31;break;
                case 8 : dias = 31;break;
                case 9 : dias = 30;break;
                case 10 : dias = 31;break;
                case 11 : dias = 30;break;
                case 12 : dias = 31;break;
            }
            if(i==mes){
                i=1;
                j++;
                System.out.println();
            }
            System.out.print(i + " ");
        }
        
    }
}
