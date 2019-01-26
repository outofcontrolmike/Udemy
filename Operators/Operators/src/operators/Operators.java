/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author Michael Wilson
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = 1 + 2;  // equal & Plus operator
        System.out.println("1 + 2 = " + result);
        int prevResult = result;

        result = result - 1;
        System.out.println(prevResult + " -1 = " + result);

        prevResult = result;

        result = result * 10;
        System.out.println(prevResult + " * 10 = " + result);

        prevResult = result;

        result = result / 5;
        System.out.println(prevResult + " / 5 = " + result);

        //remandiner or modulos
        prevResult = result;
        result = result % 3;
        System.out.println(prevResult + " % 3  = " + result);

        prevResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("result is now " + result);

        result += 2; // means add two to result var
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        //if then
        boolean isAlien = false;  // assignment operator
        if (isAlien == true) // comparing
        {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int topScore2 = 95;
        if ((topScore > topScore2) && (topScore < 100)) // both need to be true to print
        {
            System.out.println("Greater than top score and less than 100");
        }

        //or 
        if ((topScore > 90) || (topScore2 <= 90)) // one of these are ture
        {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar == true) {  // this checks variable comparison.. checks to to see if boolean is true
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;      //turnary operator
        if (wasCar) {
            System.out.println("was is true");
        }

        // 1. Create a double variable with the value 20
        // 2. Create a second variable with value of 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write if statemnt that displays a message " total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less.
        double value = 20;
        double value2 = 80;

        double total = 25 * (value + value2);
        System.out.println("The sum of value 1 & 2 is : " + total);

        double div = total % 40;
        System.out.println("sum / 540 = " + div);
        
        if(div <= 20){
            System.out.println("Total was over the limit");
        }
        
        
        
        
        
    }

}
