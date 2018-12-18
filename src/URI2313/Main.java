package URI2313;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
 
    public static long max(long a, long b){
        return ( (a>b) ? a:b );
    }
    
    public static long min(long a, long b){
        return ( (a<b) ? a:b );
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long x = max(a, max(b,c));
        long z = min(a, max(b,c));
        long y = a + b + c - x - z;

        if(x >= y+z){
            System.out.println("Invalido");
        }
        else{
            if(x==y && y==z){
                System.out.println("Valido-Equilatero");
            }
            else if(x!=y && y!=z && x!=z){
                System.out.println("Valido-Escaleno");
            }
            else{
                System.out.println("Valido-Isoceles");
            }
            
            if(Math.pow(x, 2) == (Math.pow(y, 2))+(Math.pow(z, 2))){
                System.out.println("Retangulo: S");
            }
            else{
                System.out.println("Retangulo: N");
            }
        }
        //System.out.println(a+" "+b+" "+c);
    }
}
