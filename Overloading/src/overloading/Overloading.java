/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author mw0415436
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int newScore = calculateScore("Mike", 500);
        System.out.println("New Score = " + newScore);
        calculateScore(75); // calling overloaded method
        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if(centimeters < 0.0) {
            System.out.println("Invalid parameter");
        }
        calcFeetAndInchesToCentimeters(500);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet <= 0) || ((inches <= 0 || inches >= 12))) {
            System.out.println("Invalid");

            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet " + inches + " inches " + centimeters + " cm ");

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + "inches is equal to " + feet + " feet and" + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    // create a method called calFeetAndInchesToCentimeters
    // It needs to have two parameters
    // feet is the first parm, inches is 2nd
    // 
    // validate that the first param is >= 0
    // validate that the 2nd parm inches is >=0 <=12
    // return -1 from the method if either of the above is not ture
    //
    // If the parms are valid, then calculate how many centimeters
    // comprise the feet and inches passed to this method and return the value
    // 
    // create a 2nd method of the same type but with only one param
    // inches is the param
    // validate that it's >=0
    // return -1 if its not true
    // but if it's valid, then calc how mnay fet are in the inches
    // and then here is the tricky part
    // call the other overloaded method passing the correct feet and inches
    // calculated so that it can cal correctly
    // hints: use double data type
    // 1 inch = 2.54 cm and one foot =12 inch
    // calling another overloaded method just requires you to use the correct number of parameters
    public static int calculateScore(String pName, int score) {
        System.out.println("Player " + pName + " Scored " + score + " Points ");
        return score * 1000;
    }

    // overloaded method
    public static int calculateScore(int score) {
        System.out.println("Unamed Player scored " + score + " Points ");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name, No Score");
        return 0;
    }
}
