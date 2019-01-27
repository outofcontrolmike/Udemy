/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seconds.minutes;

/**
 *
 * @author Michael Wilson
 */
public class SecondsMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(200));

    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";

        }
        
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }
    
    private static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        
        return getDurationString(minutes, remainingSeconds); // returning return value from method
        
    }
}
