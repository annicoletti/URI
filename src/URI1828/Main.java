package URI1828;

/**
 *
 * @author NICOLETTI A.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main m = new Main();
        int cases = scan.nextInt();
        for (int i = 1; i <= cases; i++) {
            String player1 = scan.next();
            String player2 = scan.next();
            System.out.printf("Caso #%d: %s\n",i,m.jogar(player2,player1));
        }
    }
    public String jogar(String s1, String s2){
        
        String phrase;
        if(s1.equals(s2)){phrase = "De novo!";}
        else if(s1.equals("tesoura")&&s2.equals("papel")){phrase = "Raj trapaceou!";}      
        else if(s1.equals("papel")&&s2.equals("pedra")){phrase = "Raj trapaceou!";}
        else if(s1.equals("pedra")&&s2.equals("lagarto")){phrase = "Raj trapaceou!";}
        else if(s1.equals("lagarto")&&s2.equals("Spock")){phrase = "Raj trapaceou!";}
        else if(s1.equals("Spock")&&s2.equals("tesoura")){phrase = "Raj trapaceou!";}
        else if(s1.equals("tesoura")&&s2.equals("lagarto")){phrase = "Raj trapaceou!";}
        else if(s1.equals("lagarto")&&s2.equals("papel")){phrase = "Raj trapaceou!";}
        else if(s1.equals("papel")&&s2.equals("Spock")){phrase = "Raj trapaceou!";}
        else if(s1.equals("Spock")&&s2.equals("pedra")){phrase = "Raj trapaceou!";}
        else if(s1.equals("pedra")&&s2.equals("tesoura")){phrase = "Raj trapaceou!";}
        else {phrase="Bazinga!";}
        return phrase;
               
    }
}
