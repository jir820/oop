/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jirley Gissel Suarez
 */
public class RollDices {

    public static int rollDices(){
        Random random=new Random();
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        
        int lives=5,dice1=0,dice2=0,m=1;
        String play_name,key,attempt,player_lives, dado1,dado2;
        
        
        System.out.println("\n::: WELCOME TO ROLL DICES:::");
        System.out.println("Your player name: ");
            play_name=data.nextLine();
        
        int i=1,sum=0,pares=0,impares=0,iguales=0,consecutivos=0;
        while(true){
           System.out.println("\nPress any key to roll dices!!!");
            key=data.nextLine();
            
            System.out.println("\nintento Nro.: " + m++);
            dice1=rollDices();
            dice2=rollDices();
            sum=dice1+dice2;
            System.out.println("dice1: "+ dice1 +"\n"+"dice2: "+ dice2);
            System.out.println("la suma de dice1 y dice2 es: "+sum);
           
            
            if (dice1 == dice2) {
                      consecutivos++;
                      iguales++;
                      System.out.println("consecutivos: "+ iguales);
            }else{
                    consecutivos=0;
                } 
                if(dice1==6 && dice2==6){
                pares++;
                consecutivos++;
                iguales++;
                System.out.println("se te suma una vida " + ++lives);
                System.out.println("consecutivos: "+ iguales);
                System.out.println("consecutivos: "+ consecutivos);
                }else if (sum % 2 == 0) {
                    pares++;
                    System.out.println("misma cantidad de vida: "+ lives);
                }else if (sum % 2 != 0) {
                    impares++;
                    System.out.println("se te resta una vida: "+ --lives);
                 }
                 
                    
            if(consecutivos==3){
                System.out.println("\n YOU WIN!");
                break;
            }else if (lives == 0) {
                System.out.println("\n GAME OVER!");
                break;
            }
            i++;
        }
        System.out.println("\n::: REPORT :::");
        System.out.println("Player name: " + play_name+"\n");
        System.out.println("player lives: " + i +"\n");
        System.out.println("Total tiros par: " + pares +"\n");
        System.out.println("Total tiros impar: " + impares + "\n");
        System.out.println("Total dados iguales: " + iguales);    
        
    }
}
