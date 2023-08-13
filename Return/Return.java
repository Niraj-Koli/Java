package Return;

public class Return {
    public static void displayScoreGroup(String name, int highScore) {
        System.out.println("Group: " + highScore + " -> " + name);
    }

    public static int calculateScore(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        int highScore = calculateScore(1300);
        displayScoreGroup("Kaizer", highScore);

        highScore = calculateScore(450);
        displayScoreGroup("Vivy", highScore);

        highScore = calculateScore(60);
        displayScoreGroup("Dante", highScore);

        highScore = calculateScore(800);
        displayScoreGroup("Nero", highScore);
    }
}
