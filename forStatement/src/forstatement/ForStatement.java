/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forstatement;

/**
 *
 * @author mw0415436
 */
public class ForStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Gets very tedious
//        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% = " + calculateInterest(10000.0, 5.0));
        // for(intt; termination; increment) {
        //       }
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }

        // we use i as a paramter to pass into the interestRate variable
        for (int i = 2; i <= 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%2f", calculateInterest(10000.0, i)));
        }
        System.out.println("");

        // run this backwards
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%2f", calculateInterest(10000.0, i)));
        }

        System.out.println("");
        
        
        // Create a statment using any range of numbers
        // Determine if the number is prime number using isPrime method
        // If it is prime, print it out and increment a count of the number of prime numbers found
        // if that count is 3, exit the loop
        // Use break if count = 3;

        int count = 0;
        for (int i = 10; i < 10000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 10) {
                    System.out.println("Exiting For Loop");
                    break;
                }
            }

        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        // startng at 2 and going up to whatever.
        //
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;    // Will compute
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
