package URI2486;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    public static int consumo(int qtd, String desc){
        switch(desc){
            case " suco de laranja" : {
                return qtd * 120; 
            }
            case " morango fresco" : {
                return qtd * 85; 
            }
            case " mamao" : {
                return qtd * 85; 
            }
            case " goiaba vermelha" : {
                return qtd * 70; 
            }
            case " manga" : {
                return qtd * 56; 
            }
            case " laranja" : {
                return qtd * 50; 
            }              
            case " brocolis" : {
                return qtd * 34; 
            }
            default : 
                return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        
        while ((n=scan.nextInt())>0){
            int sodio=0;
            for (int i = 0; i < n; i++) {
                int numero = scan.nextInt();
                String nome =  scan.nextLine();
                //System.out.println(nome +" " + numero);
                sodio += consumo(numero, nome);
            }
            //System.out.println(sodio);
            if(sodio>130){
                System.out.println("Menos "+ (sodio-130) +" mg");
            }
            else if(sodio<110){
                System.out.println("Mais "+ (110-sodio) +" mg");
            }
            else{
                System.out.println(sodio + " mg");
            }
        }
    }
}
