package URI2684;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {    
    
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);    
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(new Code(scan.nextInt(),scan.nextLine()));
        }
    }

    public static class Code{
        private String linha, matriz[];
        private boolean valid;
        private int parametro;
        private ArrayList<String> list;
        
        public Code(int p, String l){
            this.linha = l;
            this.parametro = p;
            switch(parametro){
                case 0:{
                    if(CheckCode0(linha)>=1){
                        this.valid = true;
                    }
                    else{
                        this.valid = false;
                    }
                    break;
                }
                case 1:{                    
                    if(CheckCode1(linha)>=1){
                        this.valid = true;
                    }
                    else{
                        this.valid = false;
                    }
                    break;
                }
            }
        }
                
        public int CheckCode1(String line){
            this.matriz = line.split("");
            int n = 0, r = 0;
            for (int i = 0; i < this.matriz.length; i++) {
                if(this.matriz[i].equals("<")){
                    n++;
                    r++;
                }
                else if(this.matriz[i].equals(">")){
                    n--;
                    r++;
                }
                else if(this.matriz[i].equals("/")){
                    return -1;
                }
                if(n<0){
                    return -1;
                }
                //System.out.println(this.matriz[i]);
            }
            //System.out.println("n="+n+" r="+r);
            if(r!=2){
                return -1;
            }
            return 1;
        }
        
        public int CheckCode0(String line){
            ArrayList<String> pilha = new ArrayList<>();
            this.matriz = line.split("");
            for (int i = 0; i < this.matriz.length; i++) {
                if(!matriz[i].equals(">")){
                    if(matriz[i].equals("<")){
                        if(i==matriz.length-1){
                            return -1;
                        }
                        String s = matriz[i];
                        do{
                            String c = matriz[i+1];
                            s += matriz[i+1];
                            if(s.length()>1 && c.equals("<")){
                                return -1;
                            }
                            i++;
                            //System.out.println(i + " " + s);
                        }while(!matriz[i].equals(">"));
                        pilha.add(s);
                    }
                }
                else{
                    return -1;
                }
            }
            
            System.out.println("-----");
            ArrayList<String> jaVerificados = new ArrayList<>();
            int abre=0,fecha=0;
            for (int i = 0; i < pilha.size(); i++) {
                if(pilha.get(i).contains("/")){
                    fecha++;
                }
                else{
                    abre++;
                }
            }
            if(fecha>abre){
                return -1;
            }
            int opened=0, closed=0,event=0;
            for (int i = 0; i < pilha.size(); i++) {
                if(pilha.get(i).contains("/")){
                    closed++;
                    event--;
                }
                else{
                    opened++;
                    event++;
                }
            }
            
            System.out.println("---");
            if(event>1){
                return -1;
            }
            else if(closed==0 && opened==0){
                return -1;
            }
            
            System.out.println(pilha);
            
            return 1;
        }
        
        @Override
        public String toString(){
            String resposta;
            if(this.valid){
                resposta = "Successful !!";
            }
            else{
                resposta = "error";
            }
            return resposta;
        }        
    }
}