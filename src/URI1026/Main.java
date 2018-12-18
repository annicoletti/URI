package URI1026;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            long n1 = scan.nextLong();
            long n2 = scan.nextLong();
            
            String b1 = Long.toBinaryString(n1);
            String b2 = Long.toBinaryString(n2);
            
            
            String zero = "";
            int z = Math.abs(b1.length()-b2.length());
            //System.out.println(z);
            for (int i = 0; i < z; i++) {
                zero += "0";
            }
            
            //System.out.println(b1 + " " + b2 + " " + zero);
            //System.out.println(b1.length() + " " + b2.length());
            if(b1.length()>b2.length()){
                //System.out.println("UM");
                b2 = zero + b2;
            }
            else if(b1.length()<b2.length()){
                //System.out.println("DOIS");
                b1 = zero + b1;
            }
           
            String[] a1 = b1.split("");
            String[] a2 = b2.split("");            
            String xor = "";
            
            for (int i = 0; i < b1.length() ; i++) {
                if(!a1[i].equals(a2[i])){
                    xor += "1";
                }
                else{
                    xor += "0";
                }
                //System.out.print(xor[i]);
            }
            
            System.out.println(Long.parseLong(xor,2));            
            //System.out.println(b1 + " " + b2 + " XOR>> " + xor);
        }
    }
}
