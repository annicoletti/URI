package URI2338;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
    
    public static Scanner scan;
    private String code,message;
    private static ArrayList<String> lista;// = new ArrayList<String>();
    
    public Main1(String code){
        setCode(code);
        this.message = "";
        lista = new ArrayList<String>();
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getMessage(){
        return message;
    }
    
    public void montaArray(){
        String temp[] = getCode().split("");
        for (int i = 0; i < temp.length; i++) {
            lista.add(temp[i]);
        }
        System.out.println(lista);
    }
    
    public void decript(){
        String m = getMessage();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(".")){
                int t = 0;
                lista.remove(i);
                while(i!=0){                    
                    m += lista.get(t);
                    lista.remove(t);
                    i--;
                }
                System.out.println(m + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Main1 m = new Main1(scan.nextLine());
        m.montaArray();
        m.decript();
    }
}
