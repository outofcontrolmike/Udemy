/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mw0415436
 */
public class SumOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10));
    }

    // Create a method called isOdd with in para number
    // how do I figure out how a number is odd? 
    // I know how to figure out if it is even
    // if num %2 = 0;  if the remainder of a number is = 0, it's even
    // do the opposite
    public static boolean isOdd(int number) {
        if ((number == 1) || (number % 2 == 1)) {
            
            return true;

        }
        return false;

    }

    // Second method sumOdd that represents a range
    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start) && (end > 0)) {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)){
                    sum += i;
                }
                
                
            }

        }
       return sum;
}}
