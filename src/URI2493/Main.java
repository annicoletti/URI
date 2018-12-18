package URI2493;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    
    private String nome,operacao;
    private int indice;
    private boolean acertou;
    
    public Main(String nome, int indice, String operacao){
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
            Main m[] = new Main[n];
            for (int i = 0; i < n; i++) {
                m[i] = new Main(scan.next(), (scan.nextInt()-1), scan.next());
                //if(m[i].getOperação().equals(b[m[i].getIndice()].getResult())){
                //System.out.println(b[i].getResult());
                if(b[m[i].getIndice()].getResult().contains(m[i].getOperação())){
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
        private String s[];
        double x,y,r;
        ArrayList<String> result; 
        
        public Bets(double x, String s){
            this.s = s.split("=");
            this.y = Double.parseDouble(this.s[0]);
            this.r = Double.parseDouble(this.s[1]); 
            result = new ArrayList<String>();
            Result(x,this.y,this.r);
            //System.out.println(result);
        }
        
        public ArrayList getResult(){
            return result;
        }
        
        public void Result(double x, double y, double r){
            if(x+y == r){
                this.result.add("+");
                //System.out.println("+");
            }
            if(x-y == r){
                this.result.add("-");
            }
            if(x*y == r){
                this.result.add("*");
            }
            if(x/y == r){
                this.result.add("/");
            }
            if(result.isEmpty()){
                this.result.add("I");
            }
        }        
    }
}

