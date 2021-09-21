package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 3000;
        int levelCompleted = 4;
        int bonus = 100;

//        if(score < 5000 && score > 10000){
//            System.out.println("Your Score was 3000");
//            System.out.println("this line was executed");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("got here");
//        }

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        // int savedFinalScore = finalScore; // cannot access variables outside of codeblock because of scope.

        // Print out a second score ont eh screen with the followoign
        // score set to 10000
        score = 10000;
        // levelCompleted set to 8
        levelCompleted = 8;
        // bonus set to 200
        bonus = 200;
        // but make sure the first printout above still displays as well
        if(score <= 5000 || score >= 10000){
            System.out.println("Your Score was either less than 5000 or greater than 10000");
            System.out.println("this line was executed");
        } else if(score < 1000){
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("got here");
        }

    }
}
