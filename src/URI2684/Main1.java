package URI2684;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {    
    
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
                    CheckCode0(linha);
                    break;
                }
                case 1:{                    
                    CheckCode1(linha);
                    break;
                }
            }
        }
        
        public void MakeMatriz(){
            this.matriz = this.linha.split("");
        }
        
        public int MakeString(){
            MakeMatriz();
            String chaves = "";
            for (int i = 0; i < this.matriz.length ; i++) {
//                boolean next = true;
//                if(i+2 < this.matriz.length){
//                    String temp = this.matriz[i]+this.matriz[i+1]+this.matriz[i+2];
//                    if(temp.equals("</ ")){
//                        return -1;
//                    }
//                }
//                if(i+1 < this.matriz.length){
//                    String temp = this.matriz[i]+this.matriz[i+1];
//                    if(temp.equals("<>")){
//                        return -1;
//                    }
//                }
                if(this.matriz[i].equals("<") || this.matriz[i].equals("/") || this.matriz[i].equals(">")){
                    chaves+=this.matriz[i];
                }
            }
            this.linha = chaves;
            //System.out.println(this.linha);
            return 1;           
        }
        
        public void CheckCode1(String line){
            MakeMatriz();
            int a=0,f=0;
            boolean erro = false;
            for (int i = 0; i < this.matriz.length; i++) {
                if(this.matriz[i].equals("<")){
                    a++;
                }
                else if(this.matriz[i].equals(">")){
                    f++;
                }
                else if(this.matriz[i].equals("/")){
                    erro = true;
                }
            }
            if(a==f && a==1 && erro==false){
                this.valid = true;
            }
            else{
                this.valid = false;
            }
        }
        
        public boolean Simplest(){
            this.matriz = this.linha.split(">");
            int pilha = 0;
            for(String s : matriz){
                if(s.equals("<")){
                    pilha++;
                }
                else{
                    pilha--;
                }
                
                if(pilha<0){
                    return false;
                }
                //System.out.println(s);
            }
            if(pilha>=0){
                return true;
            }
            return false;
        }
        
        public boolean VerifyCode0(){
            MakeMatriz();
            int key = 0, tagFecha=0, tagAbre=0;
            for (int i = 0; i < this.matriz.length; i++) {
                if(this.matriz[i].equals("<")){
                    if(this.matriz[i+1].equals("/")){
                        tagFecha++;
                        for (int j = i+1; j < this.matriz.length; j++) 
{
                            if(this.matriz[j].equals(">")){
                                tagFecha++;
                                i=j;
                            }
                        }
                        if(tagFecha==2){
                            tagFecha=0;
                            key--;
                        }
                        else{
                            return false;
                        }
                    }
                    else{                        
                        tagAbre++;
                        for (int j = i+1; j < this.matriz.length; j++) 
{
                            if(this.matriz[j].equals(">")){
                                tagAbre++;
                                i=j;
                            }
                        }
                        if(tagAbre==2){
                            tagAbre=0;
                            key++;
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        
        public void CheckCode0(String line){
            //System.out.println(MakeString());
            if(MakeString()>0){                
                this.valid = Simplest();
            }
            else{
                this.valid = false;
            }
        }
        
        @Override
        public String toString(){
            String resposta;
            if(this.valid){
                resposta = "Successful!!";
            }
            else{
                resposta = "error";
            }
            return resposta;
        }
        
    }
}