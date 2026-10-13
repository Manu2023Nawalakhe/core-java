public class Main {

    public static void main(String[] args){
//        int newScore=calculateScore("Manisha" , 100);
//        System.out.println("New score is " + newScore);
//
//        calculateScore(200);
//        calculateScore();

        System.out.println("New Score is "+ calculateScore("Manisha",12));
        System.out.println("New Score is "+ calculateScore(10));
    }
    public static int calculateScore(String playerName,int score){
        System.out.println("Player " + playerName + " score " + score + " Point");
        return score * 1000;
    }

    public static int calculateScore(int score){
//        System.out.println("unnamed player scored" + score + " Point");
//        return score * 1000;
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(){
        System.out.println("No player Name, No scored");
        return 0;
    }
}
