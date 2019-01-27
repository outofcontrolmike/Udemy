/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayoftheweekchallenge;

/**
 * @author Michael Wilson
 */
public class DayOfTheWeekChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }
    
    private static void printDayOfTheWeek(int day){
        if(day == 0){
            System.out.println("Sunday");
        }else if(day == 1){
            System.out.println("Monday");
        }else if(day ==2) {
            System.out.println("Tuesday");
        }else if (day == 3) {
            System.out.println("Wed");
        }
        
        else if (day == 4) {
            System.out.println("Thurs");
        }
        else if (day == 5) {
            System.out.println("Friday");
        }
        else if (day == 6) {
            System.out.println("Saturday");
        }else {
            System.out.println("invalid day");
        }
      /* switch(day) {
           case 0:
               System.out.println("Sunday");
               break;
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3: 
               System.out.println("Wed");
               break;
           case 4: 
               System.out.println("Thurs");
               break;
           case 5: 
               System.out.println("Friday");
               break;
           case 6: 
               System.out.println("Saturday");
               break;
               
           default: 
               System.out.println("Invalid day");
               break;
    }
       */
    }
    
}
