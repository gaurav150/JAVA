public class ChallengePractice49 {

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high Score List.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int result;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore >= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }

    public static void main(String[] args) {
        int positionFirstPlayer = calculateHighScorePosition(1500);
        int positionSecondPlayer = calculateHighScorePosition(1000);
        int positionThirdPlayer = calculateHighScorePosition(500);
        int positionFourthPlayer = calculateHighScorePosition(100);
        int positionFifthPlayer = calculateHighScorePosition(25);
        displayHighScorePosition("Rohit", positionFirstPlayer);
        displayHighScorePosition("Dinesh", positionSecondPlayer);
        displayHighScorePosition("Prasanna", positionThirdPlayer);
        displayHighScorePosition("Jugal", positionFourthPlayer);
        displayHighScorePosition("Ojas", positionFifthPlayer);
    }
}


// 1500,1000,500,100,25