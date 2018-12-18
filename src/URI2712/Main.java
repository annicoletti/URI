package URI2712;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String placa[] = scan.next().split("-");
            int dia = validaPlaca(placa);
            switch(dia){
                case 1 : System.out.println("MONDAY"); break;
                case 2 : System.out.println("TUESDAY"); break;
                case 3 : System.out.println("WEDNESDAY"); break;
                case 4 : System.out.println("THURSDAY"); break;
                case 5 : System.out.println("FRIDAY"); break;
                default : System.out.println("FAILURE"); break;
            }
        }
    }
    
    public static int validaPlaca(String[] placa){
            int numero;            
            boolean parar = false;
            
            
            if(placa[0].length() != 3){
                //System.out.println("F:Check Letras != 3");
                return -1;
            }
            if(placa[1].length() != 4){
                //.out.println("F:Check Numeros != 4");
                return -1;
            }
            
            
            String s[] = placa[0].split("");
            for (int i = 0; i < s.length; i++) {
                if( !s[i].matches("[A-Z]") ){
                    //System.out.println("F:Check Letras [A-Z]");
                    return -1;
                }
            }
            
            try{
                numero = Integer.parseInt(placa[1]);
            }
            catch(Exception ex){
                //System.out.println("F:Check Converter Numero");
                return -1;
            }
            
            String u[] = placa[1].split("");
            numero = Integer.parseInt(u[3]);
            //System.out.println("ULTIMO NUMERO DA PLACA = " + numero);
            
            //System.out.println("IF Final...");
            
            if(numero==0){
                return 5;
            }
            else if(numero <= 2){
                return 1;
            }
            else if(numero <= 4){
                return 2;
            }
            else if(numero <= 6){
                return 3;
            }
            else if(numero <= 8){
                return 4;
            }
            else{
                return 5;
            }
        }
}
