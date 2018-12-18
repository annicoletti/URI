package URI2060;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int lista[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            lista[i]= scan.nextInt();
        }
        
        int m2=0, m3=0, m4=0, m5=0;
        
        for (int i = 0; i < n; i++) {
            if(lista[i]%2==0){
                m2++;
            }
            if(lista[i]%3==0){
                m3++;
            }
            if(lista[i]%4==0){
                m4++;
            }
            if(lista[i]%5==0){
                m5++;
            }
        }
        System.out.printf("%d Multiplo(s) de 2\n",m2);
        System.out.printf("%d Multiplo(s) de 3\n",m3);
        System.out.printf("%d Multiplo(s) de 4\n",m4);
        System.out.printf("%d Multiplo(s) de 5\n",m5);
        
    }
}
