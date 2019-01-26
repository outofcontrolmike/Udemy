/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charandboolean;

/**
 *
 * @author Michael Wilson
 */
public class CharAndBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //char width of 16 (2 bytes)
        char myChar = '\u00a9'; // or '1', '&'  width of 16, two bytes
        System.out.println("Unicode Char" + myChar);
        
        // used for conditional logic
        boolean myBoolean = true;
        boolean myBoolean2 = false;
        
        boolean isMale = true;
        
        
        // challenge
        
        // find code reg symbol on the web
        // create a variable of type char and assign it the symbol
        // print out
        
       char regSymbol = '\u00AE';
        System.out.println("uniCode Char = " + regSymbol);
        
    }
    
}
