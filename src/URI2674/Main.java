package URI2674;

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
            if(Primo(n)){
                String x[] = Integer.toString(n).split("");
                boolean superPrimo = true;
                for (int i = 0; i < x.length; i++) {
                    if(!Primo(Integer.parseInt(x[i]))){
                        superPrimo = false;
                    }
                }
                if(superPrimo){
                    System.out.println("Super");
                }
                else{
                    System.out.println("Primo");
                }
            }
            else{
                System.out.println("Nada");
            }
        }
        scan.close();
    }
    
    public static boolean Primo(int numero){
        int count = 0;
        if(numero>1){
            for (int i = 1; i <= numero; i++) {
                //System.out.printf("%d %% %d = %d\n", numero, i, ((int)numero%i));
                if(numero%i==0){
                    count++;
                    if(count>2){
                        break;
                    }
                }
            }
            //System.out.println("COUNT : " + count);
            if(count == 2){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }    
}
