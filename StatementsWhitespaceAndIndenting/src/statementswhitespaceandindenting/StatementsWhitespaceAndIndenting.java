/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementswhitespaceandindenting;

/**
 *
 * @author Michael Wilson
 */
public class StatementsWhitespaceAndIndenting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myVar = 50;  // statement/ complete line
        myVar++;
        myVar--; // also statments

        System.out.println("This is a test"
                + " another "
                + "Still more");
        // doesn't matter if it's on multiple lines

        // white space example
        int anotherVariable = 50;
        myVar--;
        System.out.println("This is another one");

    }

}
