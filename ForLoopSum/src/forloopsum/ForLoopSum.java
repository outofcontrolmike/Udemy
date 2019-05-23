package forloopsum;

/**
 *
 * @author mw0415436
 */
public class ForLoopSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // for statetment that ranges from 1 - 1000
        // Sum all numbers that can be divided with both 3 and also with 5
        // if i % 3 == 0 && i % 5 == 0 - print the sum of all those numbers

        // create my variables
        // count will tell my program to stop
        // sum is my varible that I'll manipulate to keep adding to
        int count = 0;
        int sum = 0;
        
        // This program will check up to 1000 integers for a certain condition
        for(int i = 0; i <= 1500; i++) {
            if(i % 3 == 0  && i % 5 == 0) {
                count++;    // increases the count of found divided numbers
                sum += i;   // Here we are adding the found values together.. reassaigning it'self each time it meets the condition
                System.out.println("Number found = " + i);      // Prints out the found value
            }
            // Our condition that tells our program how many values to find. 
            if(count == 100) {
                break;
            }
        }
        
        // Prints the sum of all the variables
        System.out.println("Sum of all the found diviisonals = " + sum);
    
    
    
    
    }}
    
