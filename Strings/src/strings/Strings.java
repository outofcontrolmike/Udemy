/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Michael Wilson
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myString = "this is a string";
        System.out.println("myString is equal " + myString);
        // this appends 
        myString = myString + ", and this is more.";
        System.out.println("myString is equal " + myString);
        myString = myString + " \u00a9 2015";
        System.out.println("myString is equal " + myString);
        
        // these concatonate strings, they won't calculate together
        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println("result is " + numString);

        
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is equal to " + lastString);
        double dNumber = 120.47;
        lastString = lastString + dNumber;
        System.out.println("Last String value = " + lastString);
    
    }
    
}
