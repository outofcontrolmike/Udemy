/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theswitchstatement;

/**
 *
 * @author mw0415436
 */
public class TheSwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // if else statement
        int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("2");
        } else {
            System.out.println("Was not one or two");
        }
        System.out.println("");

        // use a switch statment - usually only good for one
        int switchValue = 4;

        // try switch
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            // Grouping cases 
            case 3:
            case 4:
            case 5:
                System.out.println("was 3 4 or 5");
                System.out.println("Actually is " + switchValue);
                break;
            default:
                System.out.println("Was not one or two");
                break;
        }

        // More code here - A challenge
        
        // User a char instead of int - Check for A, B, C, D, E
        
        char valueSwitch = 'D';
        
        switch(valueSwitch) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("You typed A, B, C, D or E ");
                System.out.println("You typed " + valueSwitch);
                break;
            default: System.out.println("You type an incorrect key");
        }
        
        // Use Strings for a switch case
        String month = "JAnuary";
        
        // toLowerCase will handle exception handling
        switch(month.toLowerCase()) {
           
            case "january": 
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
        
    }
}
