package URI2334;

/**
 *
 * @author NICOLETTI A.
 */
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) throws IOException  {
            
        String in,compara = "-1";
        Scanner scan = new Scanner(System.in);
        BigInteger numero = new BigInteger("1");
        BigInteger menosum = new BigInteger("-1");
        BigInteger zero = new BigInteger("0");
        boolean continua = true;
        
        //while(numero.equals(scan.nextLine()) != menosum){
        while(continua){
            //in = scan.next();
            numero = scan.nextBigInteger();
            //System.out.println("NUMERO = " + numero);
            if(numero.equals(menosum)){
                continua = false;
            }
            else if(numero.equals(zero)){
                System.out.println("0");
            }
            else{ 
                //System.out.println("ELSE \nMENOSUM = " + menosum);
                System.out.println(numero.add(menosum));
                //System.out.println(numero);
            }
        }
    }
}
