package URI2718;

/**
 *
 * @author NICOLETTI A.
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (long i = 0; i < n; i++) {
            
            String binary[] = toBinary(scan.nextLong()).split("");
            int q = 0;
            int max = 0;
            
            if(binary.length > 1){
                for (int j = 0; j < binary.length; j++) {
                    if(binary[j].equals("1")){
                        q++;
                        if(q>max){
                            max = q;
                        }
                    }
                    else{
                        q=0;
                    }
                }
                System.out.println(max);
            }
            else{
                System.out.println(binary[0]);
            }
            //System.out.println("i: " + i);
        }
    }
    
    public static String toBinary(long n){
        ArrayList<Long> lista = new ArrayList<>();
        String b = "";
        
        if(n==0){
            return "0";
        }
        else if(n==1){
            return "1";
        }
              
        while(n>=2){
            lista.add((n%2) );
            n = n / 2L;
        }
        lista.add(1L);
        
        for (int i = lista.size()-1; i >= 0; i--) {
            long t = lista.get(i);
            String tt = Long.toString(t);
            b += tt;
           // b += Integer.toString((lista.get(i)));
        }
        
//        for (int i = lista.size(); i >= 0; i--) {
//            System.out.println(Long.toString(lista.get(i)));
//        }

        //System.out.println(lista);
        ///System.out.println(b);
        return b;
    } 
}