package URI2029;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            
            double v = scan.nextDouble();
            double d = scan.nextDouble();
            
            double area = 3.14 * (Math.pow((d/2),2));
            double altura = v/area;
            
            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", area);
            
        }
        scan.close();
    }
}
