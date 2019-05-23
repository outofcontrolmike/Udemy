/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mike.srpgsample;

import java.util.Scanner;

/**
 *
 * @author mw0415436
 */
public class MikeSRPGSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to a game of mike's text based RPG");
        System.out.println("press any key to continue");
        String entry = sc.next();
        System.out.println("I'm hoping to get way more involved with this and create a little combat system.. maybe even a GUI");
        
        System.out.print("Choose either (1) Ryu or (2) Squall:" );
        int pChoice = sc.nextInt();
        
        if(pChoice == 1) {
            Ryu();
        }
        if(pChoice == 2) {
            Squall();
        }
        
        System.out.println("Where would you like to venture to?");
        
    }
    
    
    
    
    public static void Ryu() {
        System.out.println("You chose Ryu");
        System.out.println("Player Stats: Strength: 100; HP: 2000");
        System.out.println("Special Move: Haidoken");
    }
    
    public static void Squall() {
        System.out.println("You chose Squall from FF8");
        System.out.println("Player stats: Strength: 120; HP: 1000");
        System.out.println("Special Move:  Renzouken");
    }
    
}
