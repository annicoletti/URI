/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1050;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ddd = scan.nextInt();
        switch (ddd){
            case 61: {System.out.println("Brasilia");}
            break;
            case 71: {System.out.println("Salvador");}
            break;
            case 11: {System.out.println("Sao Paulo");}
            break;
            case 21: {System.out.println("Rio de Janeiro");}
            break;
            case 32: {System.out.println("Juiz de Fora");}
            break;
            case 19: {System.out.println("Campinas");}
            break;
            case 27: {System.out.println("Vitoria");}
            break;
            case 31: {System.out.println("Belo Horizonte");}
            break;
            default: {System.out.println("DDD nao cadastrado");}
            break;
        }
    }    
}
