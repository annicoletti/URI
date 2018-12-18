package URI2493;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main3 {
    
    public static ArrayList<String> list = new ArrayList<String>();
   
    public static class Players{    
        private String nome, operacao;
        private int indice;
        private boolean acertou;
 
        public Players(String nome, int indice, String operacao){
            this.nome = nome;
            this.indice = indice;
            this.operacao = operacao;
            this.acertou = false;
        }
        
        public void doing(Bets b){
            if(b.impossivel && this.operacao.equals("i")){
                this.acertou = true;
            }
            else{
                ArrayList<Double> rTemp = new ArrayList<Double>(b.getResultados());
                System.out.println("rTemp<list> = " + rTemp);
                switch (operacao){
                   case "+":{
                       if(rTemp.contains((b.x + b.y))){
                           acertou = true;
                       }
                   }
                   case "-":{
                        if(rTemp.contains((b.x - b.y))){
                           acertou = true;
                       }
                   }
                   case "*":{
                        if(rTemp.contains((b.x * b.y))){
                           acertou = true;
                       }
                   }
                   case "/":{
                        if(rTemp.contains(((double)b.x /b.y))){
                           acertou = true;
                       }
                   }
               }
            }
        }

        public String getOperacao(){
            return this.operacao;
        }

        public int getIndice(){
            return this.indice;
        }
    }
    
    public static class Bets{        
        private int x,y,r;
        private ArrayList<Double> resultados;
        private double rSoma,rSubtacao,rProduto,rDivisao;
        private boolean impossivel;
        
        public Bets(int x, String t){            
            this.x = x;
            String temp[] = t.split("");
            y = Integer.parseInt(temp[0]);
            r = Integer.parseInt(temp[2]);
            resultados = new ArrayList<Double>();
            results();
        }
        
        public void results(){
            rSoma = this.x + this.y;
            rSubtacao = this.x - this.y;
            rProduto = this.x * this.y;
            rDivisao = (double)this.x / this.y;
            if(rSoma != this.r && rSubtacao != this.r && rProduto != this.r && rDivisao != this.r){
                this.impossivel = true;
            }
            else{
                this.impossivel = false;
            }
            
            if(rSoma == r){
               resultados.add(rSoma); 
            }
            if(rSubtacao == r){
                resultados.add(rSubtacao);
            }
            if(rProduto == r){
               resultados.add(rProduto); 
            }
            if(rDivisao == r){
                resultados.add(rDivisao);
            }
        }
        
        public ArrayList getResultados(){
            return resultados;
        }
        
        public void setX(int x){
            this.x = x;
        }
        
        public void setY(int y){
            this.y = y;
        }
        
        public void setR(int r){
            this.r = r;
        }
        
        
        public void printBets(){
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("R = " + r);
        }
        
    }
    
    public static void makeList(Players p){
        if(p.acertou == false){
            list.add(p.nome);
        }
    }
    
    public static void timeOfShowTheResult(int n){
        if(list.isEmpty()){
            System.out.println("NENHUM ERROU");
        }
        else if(list.size() == n){
            System.out.println("TODOS ERRARAM");
        }
        else{
            Collections.sort(list);
            String resposta="";
            for (int i = 0; i < list.size(); i++) {
                resposta += list.get(i);
                if(i<=(list.size()-1)){
                    resposta += " ";
                }
            }
            System.out.println(resposta);
        }
    }
    
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            list.clear();
            int n = scan.nextInt();
            Bets b[] = new Bets[n];
            for (int i = 0; i < b.length; i++) {
                b[i] = new Bets(scan.nextInt(), scan.next());
            }
            Players p[] = new Players[n];
            for (int i = 0; i < p.length; i++) {
                p[i] = new Players(scan.next(), (scan.nextInt()-1), scan.next());
                p[i].doing(b[ p[i].indice ]);
                makeList(p[i]);
            }
            timeOfShowTheResult(n);
        }
    }
}

