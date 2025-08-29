public class ChallengePractice40 {
    public static void main(String[] args) {
        double s = 20.00d;
        double w = 80.00d;
        double total = (s + w) * 100.00d;
        System.out.println("my Total value is" + total);
        double theRemainder = total % 40.0d;
        System.out.println("Remainder of the calculation is " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got Some Remainder");
        }
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score < 5000 && score > 1000) {
            System.out.println("Your Score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your Score Was less than 1000");
        } else {
            System.out.println("Got Here");
        }


    }
}
