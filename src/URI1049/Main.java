/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI1049;

/**
 *
 * @author Administrador
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String layerOne = scan.nextLine();
        String layerTwo = scan.nextLine();
        String layerThree = scan.nextLine();
        
        if(layerOne.equals("vertebrado")){
            if(layerTwo.equals("ave")){
                if(layerThree.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else{
                    System.out.println("pomba");
                }
            }
            else{
                if(layerThree.equals("onivoro")){
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");
                }
            }
        }
        else{
            if(layerTwo.equals("inseto")){
                if(layerThree.equals("hematofago")){
                    System.out.println("pulga");
                }
                else{
                    System.out.println("lagarta");
                }
            }
            else{
                if(layerThree.equals("hematofago")){
                    System.out.println("sanguessuga");
                }
                else{
                    System.out.println("minhoca");
                }
            }            
        }
    }
}
