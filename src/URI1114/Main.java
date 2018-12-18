/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1114;

/**
 *
 * @author Administrador
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean lock = true;
        int password;
        while(lock){
            if((password=scan.nextInt())!=2002){
                System.out.println("Senha Invalida");
            }
            else{
                System.out.println("Acesso Permitido");
                lock = false;
            }
        }
    }
}
