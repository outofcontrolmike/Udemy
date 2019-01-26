/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floatanddouble;

/**
 *
 * @author Michael Wilson
 */
public class FloatAndDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // width of an int = 32;
        
        int myIntValue = 5/2;
        
        // width of a float is 32
        float myFloatValue  = 5f/ 2f; // put a f at end.. float
        
        // width of a double is 64.. usually faster
        double mydoubleValue = (double) 5d/ 3d;  // put a d at end.. double
       
        System.out.println("myIntvalue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("my double value " + mydoubleValue);
        
        
        // convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calcuate the number of Kilograms or the number above and store in a var
        // 3. Print out the result
        
        // notes: 1 pound is equal to 0.453582
        
        double newPounds = 200;
        
        double total = newPounds * .45382;
        
        System.out.println("kilograms = " + total);
        
        double pi = 3.141_5927d;
                
        
    }
    
}
