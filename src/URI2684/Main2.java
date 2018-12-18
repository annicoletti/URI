package URI2684;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main2 {    
    
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
            //System.out.println("Parametro: " + p + " Linha: " + linha);
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
                //System.out.println("-------------------");
            }
            //REMOVER TODOS OS SIMBOLOS < / > 
//            ArrayList<String> al = new ArrayList<>();
//            
//            for (int i = 0; i < pilha.size(); i++) {
//                String s[] = pilha.get(i).split("");
//                String newString = "";
//                for (int j = 0; j < s.length; j++) {
//                    if( (!s[j].equals("<")) && (!s[j].equals("/")) && (!s[j].equals(">")) && (!s[j].equals(" ")) ){
//                        newString += s[j];
//                        //System.out.println(newString);
//                    }
//                }
//                al.add(newString);
//            }       
//
//            //COMPARANDO PARES DE CHAVES
//            Collections.sort(al);
//            //System.out.println( al );
//            for (int i = 0; i < al.size()-1; i++) {
//                
//                if( !(al.get(i).equals(al.get(i+1))) ){
//                    //System.out.println(al.get(i) + " " + al.get(i+1));
//                    return -1;
//                }
//                al.remove(i+1);
//                al.remove(i);
//            }
            //Só Contar
            ArrayList<String> jaVerificados = new ArrayList<>();
            for (int i = 0; i < pilha.size(); i++) {
                //System.out.println("<><><><><><><>");
                if(pilha.get(i).contains("/")){
                    String s[] = pilha.get(i).split("");
                    String f ="";                    
                    for (int j = 0; j < s.length; j++) {
                        if( !(s[j].equals("/") || s[j].equals(" ")) ){
                            f += s[j];
                        }
                    }
                    
                    jaVerificados.add(pilha.get(i));
                    pilha.remove(i);
                    
                    if(pilha.contains(f)){
                        pilha.remove(pilha.indexOf(f));
                    }
                    else{
                        return -1;
                    }
                    i=0;                   
//                    System.out.println(pilha);
//                    System.out.println("f = " + f);
//                    System.out.println(pilha);
//                    System.out.println(jaVerificados);
//                    //fecha++;
                }
                else{
                    //Faz igual ao de cima para checar 
                    String s[] = pilha.get(i).split("");
                    String f ="";                    
                    for (int j = 0; j < s.length; j++) {
                        if( !(s[j].equals("/") || s[j].equals(" ")) ){
                            f += s[j];
                        }
                    }
                    
                    jaVerificados.add(pilha.get(i));
                    pilha.remove(i);
                    
                    if(pilha.contains(f)){
                        pilha.remove(pilha.indexOf(f));
                    }
                    else{
                        return -1;
                    }
                    i=0;                   
//                    System.out.println(pilha);
//                    System.out.println("f = " + f);
//                    System.out.println(pilha);
//                    System.out.println(jaVerificados);
//                    //fecha++;
                }
            }
            System.out.println("Quasee..");
            System.out.println(pilha);
            if(pilha.size()>1){
                return -1;
            }
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