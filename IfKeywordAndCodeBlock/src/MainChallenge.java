public class MainChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore +=(levelCompleted * bonus);
            System.out.println("your final Score was " + finalScore);
        }
    }
}
