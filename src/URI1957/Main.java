package URI1957;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> hex = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n>=16){   
            int resto = n%16;
            hex.add(resto);
            n = n/16;
            //System.out.println("Resto: " + resto + " Divisao: " + n);
        }
        hex.add(n);
        //System.out.println(hex);
        for (int i = hex.size()-1; i >=0; i--) {
            if(hex.get(i) > 9){
                if(hex.get(i).equals(10)){
                    System.out.print("A");
                }
                else if(hex.get(i).equals(11)){
                    System.out.print("B");
                }
                else if(hex.get(i).equals(12)){
                    System.out.print("C");
                }
                else if(hex.get(i).equals(13)){
                    System.out.print("D");
                }
                else if(hex.get(i).equals(14)){
                    System.out.print("E");
                }
                else if(hex.get(i).equals(15)){
                    System.out.print("F");
                }
            }
            else{
                System.out.print(hex.get(i));
            }
        }
        System.out.println();
    }
}
