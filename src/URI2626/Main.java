package URI2626;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pedra = "pedra", papel = "papel", tesoura = "tesoura";
        String f1 = "Os atributos dos monstros vao ser inteligencia, sabedoria...";
        String f2 = "Iron Maiden's gonna get you, no matter how far!";
        String f3 = "Urano perdeu algo muito precioso...";
        String draw = "Putz vei, o Leo ta demorando muito pra jogar...";
        
        while(scan.hasNext()){
            String p1 = scan.next();
            String p2 = scan.next();
            String p3 = scan.next();
            
            if(p1.equals(papel) && p2.equals(pedra) && p3.equals(pedra)){
                System.out.println(f1);
            }
            else if(p1.equals(pedra) && p2.equals(tesoura) && p3.equals(tesoura)){
                System.out.println(f1);
            }
            else if(p1.equals(tesoura) && p2.equals(papel) && p3.equals(papel)){
                System.out.println(f1);
            }
            
            else if(p2.equals(papel) && p1.equals(pedra) && p3.equals(pedra)){
                System.out.println(f2);
            }
            else if(p2.equals(pedra) && p1.equals(tesoura) && p3.equals(tesoura)){
                System.out.println(f2);
            }
            else if(p2.equals(tesoura) && p1.equals(papel) && p3.equals(papel)){
                System.out.println(f2);
            }
            
            else if(p3.equals(papel) && p2.equals(pedra) && p1.equals(pedra)){
                System.out.println(f3);
            }
            else if(p3.equals(pedra) && p2.equals(tesoura) && p1.equals(tesoura)){
                System.out.println(f3);
            }
            else if(p3.equals(tesoura) && p2.equals(papel) && p1.equals(papel)){
                System.out.println(f3);
            }
            
            else{
                System.out.println(draw);
            }
        }
        scan.close();
    }
}
