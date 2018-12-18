package URI2162;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = 0;
        int define =0;
        
        int paisagem[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            paisagem[i] = scan.nextInt();
        }
        
        ////////////////////////////////
        if(paisagem[0] == paisagem[1]){
            c = 0;
        }
        else if(paisagem[0] > paisagem[1]){
            c = -1;
        }
        else {
            c = 1;
        }
        
        //System.out.println("C="+c);
        for (int i = 0; i < n-1; i++) {
            c = analyzer(paisagem[i], paisagem[i+1], c);
            System.out.printf("paisagem[%d] = %d : paisagem[%d] = %d c: %d - define: %d\n", i,paisagem[i], i+1, paisagem[i+1], c, define);
            if(c==0){
                define+=9;
            }
            define += c;
            //System.out.println(c + " " + define);
        }
        
        //System.out.println("<<<<RESPOSTA>>>>");
        if (define<=1 && define >=-1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
    
    //sobe   =  1
    //erro   =  0
    //desce  = -1
    public static int analyzer(int atual, int proximo, int controle){
        int t=controle;
        if(controle != 0){
            if(controle==1){
                if(atual>proximo){
                    t = -1;
                }
                else if(atual<proximo){
                    t = 1;
                }
                else{
                    t=0;
                }
            }
            else if(controle==-1){
                if (atual<proximo){
                    t = 1;
                }
                else if(atual>proximo){
                    t = -1;
                }
                else{
                    t = 0;
                }
            }
        }
        else{
            t = 9;
        }
        return t;
    }
}
