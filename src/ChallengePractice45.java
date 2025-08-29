public class ChallengePractice45 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        calculateScore(true, 1000, 9, 350);
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        System.out.println("My Age is " + myAge(1999));


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int myAge(int age) {
        return (2025 - age);
    }


}
