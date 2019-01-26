/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifkeywordandcodeblocks;

/**
 *
 * @author Michael Wilson
 */
public class IfKeywordAndCodeBlocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }else if (score < 1000){
//            System.out.println("your score was less than 1000");
//        }else{
//            System.out.println("Got here");
//        }
        if (gameOver) {      // same as saying if(gameOver == true);
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }  // finalScore gets deleted after this is executed

        // print out a second score on the screen with the following
        // score set to 10000
        //levelCompleted set to 8
        // bonus set to 200
        // make sure the first printout display as well
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (levelCompleted == 8) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        boolean newGameOver = true;
        int newScore = 800;
        int newLevelCompleted = 5;
        int newBonus = 100;

        if (newGameOver) {      // same as saying if(gameOver == true);
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
