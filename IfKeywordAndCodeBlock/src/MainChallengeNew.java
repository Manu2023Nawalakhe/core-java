public class MainChallengeNew {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;


        int highScore=calculateScore(false,5000,levelCompleted,bonus);
        System.out.println("High Score: "+highScore);



       System.out.println("The next score is " +
               calculateScore(true,5000,levelCompleted,bonus)
       );
//        if (gameOver) {
//            finalScore +=(levelCompleted * bonus);
//            System.out.println("your final Score was " + finalScore);
//        }

    }
    //Methods

//    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
////        boolean gameOver = true;
////        int score = 10000;
////        int levelCompleted = 8;
////        int bonus = 200;
//
//        int finalScore = score;
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("your final Score was " + finalScore);
//        }

public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;

    int finalScore = score;
    if (gameOver) {
        finalScore += (levelCompleted * bonus);
        finalScore += 1000;

    }

    return finalScore;
    }
}
