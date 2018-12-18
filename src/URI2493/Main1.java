package URI2493;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main1 {
    
    private String nome,operacao;
    private int indice;
    private boolean acertou;
    
    public Main1(String nome, int indice, String operacao){
        this.nome = nome;
        this.indice = indice;
        this.operacao = operacao;
        this.acertou = false;
    }
    
    public int getIndice(){
        return this.indice;
    }
    
    public String getOperação(){
        return this.operacao;
    }
    
    public boolean getAcertou(){
        return this.acertou;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void confereObj(){
        System.out.println("NOME>"+nome);
        System.out.println("INDICE>"+indice);
        System.out.println("OPERACAO>"+operacao);
        System.out.println("ACERTOU>"+acertou);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            int n = scan.nextInt();
            //Create questions
            Bets b[] = new Bets[n];
            for (int i = 0; i < n; i++) {
                b[i] = new Bets(scan.nextInt(),scan.next());
            }
            
            //Cath bets
            Main1 m[] = new Main1[n];
            for (int i = 0; i < n; i++) {
                m[i] = new Main1(scan.next(), (scan.nextInt()-1), scan.next());
                if(m[i].getOperação().equals(b[m[i].getIndice()].getResult())){
                    m[i].acertou = true;
                }
            }
            
            //show results
            ArrayList<String> winners = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                if(m[i].getAcertou() == false){
                    winners.add(m[i].getNome());
                }                
            }
            //winners.sort();
            Collections.sort(winners);
            if(winners.isEmpty()){
                System.out.println("You Shall All Pass!");
            }
            else if(winners.size()==n){
                System.out.println("None Shall Pass!");
            }
            else{
                for (int i = 0; i < winners.size(); i++) {
                    System.out.print(winners.get(i));
                    if(i<winners.size()-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    
    public static class Bets{
        private String result,s[];
        int x,y,r;
        
        public Bets(int x, String s){
            this.s = s.split("=");
            this.y = Integer.parseInt(this.s[0]);
            this.r = Integer.parseInt(this.s[1]); 
            Result(x,this.y,this.r);
        }
        
        public String getResult(){
            return result;
        }
        
        public void Result(int x, int y, int r){
            if(x+y == r){
                this.result = "+";
            }
            if(x-y == r){
                this.result = "-";
            }
            if(x*y == r){
                this.result = "*";
            }
            if(x/y == r){
                this.result = "/";
            }
            else{
                this.result = "i";
            }
        }        
    }
}

