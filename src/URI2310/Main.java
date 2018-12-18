package URI2310;

/**
 *
 * @author NICOLETTI A.
 */
import java.util.Scanner;
public class Main {
    
    private static int totalSaque, totalBloqueio, totalAtaque, totalSaqueAcertado,totalBloqueioAcertado,totalAtaqueAcertado;
    private static double porcentagemAtaque, porcentagemBloqueio, porcentagemSaque;
    private String nomeJogador;
//    private int tSaque, tBloqueio, tAtaque, aSaque, aBloqueio, aAtaque;
    
    public Main(String nomeJogador, int tSaque, int tBloqueio, int tAtaque, int aSaque,int aBloqueio, int aAtaque){
        this.nomeJogador = nomeJogador;
//        this.tSaque = tSaque; 
//        this.tBloqueio = tBloqueio;
//        this.tAtaque = tAtaque;
//        this.aSaque = aSaque;
//        this.aBloqueio = aBloqueio;
//        this.aAtaque = aAtaque;
        addJogada(tSaque, tBloqueio, tAtaque, aSaque, aBloqueio, aAtaque);
    }

    public static void giveStatics(){
        porcentagemSaque = (double)  totalSaqueAcertado*100/totalSaque;
        porcentagemBloqueio = (double) totalBloqueioAcertado*100/totalBloqueio; 
        porcentagemAtaque = (double) totalAtaqueAcertado*100/totalAtaque;
        System.out.printf("Pontos de Saque: %.2f %%.\n",porcentagemSaque);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n",porcentagemBloqueio);
        System.out.printf("Pontos de Ataque: %.2f %%.\n",porcentagemAtaque);
    }
    
    public void addJogada(int tSaque, int tBloqueio, int tAtaque, int aSaque,int aBloqueio, int aAtaque){
        Main.totalSaque += tSaque;
        Main.totalBloqueio += tBloqueio;
        Main.totalAtaque += tAtaque;
        Main.totalSaqueAcertado += aSaque;
        Main.totalBloqueioAcertado += aBloqueio;        
        Main.totalAtaqueAcertado += aAtaque;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        Main m[] = new Main[n];
        for (int i = 0; i < n; i++) {
            String nome = scan.next();
            m[i] = new Main(nome, scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
        }        
        giveStatics();
    }
}
