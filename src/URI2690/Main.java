package URI2690;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s="", temp[];
        int n;
        temp = scan.nextLine().split("");
        for (int i = 0; i < temp.length; i++) {
            if(temp[i].equals(" ")){
                break;
            }
            else{
                s += temp[i];
            }
        }
        n = Integer.parseInt(s);
        
        for (int i = 0; i < n; i++) {                   
            s = scan.nextLine();
            codeIt(s);
        }
    }
    
    public static void codeIt(String s){
        String m[] = s.split("");
        String ns = "";
        int pass = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i].matches("G") || m[i].matches("Q") || m[i].matches("a") || m[i].matches("k") || m[i].matches("u")){
                ns += "0"; pass++;
            }
            else if(m[i].matches("I") || m[i].matches("S") || m[i].matches("b") || m[i].matches("l") || m[i].matches("v")){
                ns += "1"; pass++;
            }
            else if(m[i].matches("E") || m[i].matches("O") || m[i].matches("Y") || m[i].matches("c") || m[i].matches("m") || m[i].matches("w")){
                ns += "2"; pass++;
            }
            else if(m[i].matches("F") || m[i].matches("P") || m[i].matches("Z") || m[i].matches("d") || m[i].matches("n") || m[i].matches("x")){
                ns += "3"; pass++;
            }
            else if(m[i].matches("J") || m[i].matches("T") || m[i].matches("e") || m[i].matches("o") || m[i].matches("y")){
                ns += "4"; pass++;
            }
            else if(m[i].matches("D") || m[i].matches("N") || m[i].matches("X") || m[i].matches("f") || m[i].matches("p") || m[i].matches("z")){
                ns += "5"; pass++;
            }
            else if(m[i].matches("A") || m[i].matches("K") || m[i].matches("U") || m[i].matches("g") || m[i].matches("q")){
                ns += "6"; pass++;
            }
            else if(m[i].matches("C") || m[i].matches("M") || m[i].matches("W") || m[i].matches("h") || m[i].matches("r")){
                ns += "7"; pass++;
            }
            else if(m[i].matches("B") || m[i].matches("L") || m[i].matches("V") || m[i].matches("i") || m[i].matches("s")){
                ns += "8"; pass++;
            }
            else if(m[i].matches("H") || m[i].matches("R") || m[i].matches("j") || m[i].matches("t")){
                ns += "9"; pass++;
            }
            if(pass==12){
                break;
            }
        }
        System.out.println(ns);
    }
}
