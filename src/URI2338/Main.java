package URI2338;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int x = 0; x < n; x++) {
            
            String code[] = scan.nextLine().split("");
            String message = "";
            
            for(int i = 0; i < code.length; i++) {
                for (int j = 0; j<100; j++) {
                    if(code[i].equals("=")){
                        message+=code[i];
                        i++;
                    }
                    else if(code[i].equals(".") && code[i+1].equals(".") && code[i+2].equals(".")){
                        i+=7;
                        break;
                    }
                    else if(code[i].equals(".") && code[i+1].equals(".") && code[i+2].equals(".") && code[i+3].equals(".") && code[i+4].equals(".")){
                        message += " ";
                        i+=5;
                        break;
                    }                   
                    
                }
            }
        }
    }
}
