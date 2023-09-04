package Methods;

public class Methods {

    public static void calculateScore(boolean gameOver, int score, int level, int bonus) {
        if (gameOver) {
            int finalScore = score + (level * bonus);
            System.out.println("Your Score Is " + finalScore);
        } else {
            System.out.println("Your Game Is Still Going On !!!");
        }
    }

    public static void main(String[] args) {
        calculateScore(true, 10000, 5, 200);

        boolean gameOver = true;
        int score = 7000;
        int level = 2;
        int bonus = 400;

        calculateScore(gameOver, score, level, bonus);

        calculateScore(false, 3000, 7, 500);
    }
}
