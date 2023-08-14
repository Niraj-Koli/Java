package IfElse;

public class IfElse {
    public static void main(String[] args) {
        String name[] = { "Kaizer", "Vivy", "Dante", "Nero", "Hertz" };
        int score[] = { 81, 72, 67, 54, 45 };

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 80) {
                System.out.println(name[i] + " Has A Best Score.");
            } else if (score[i] >= 70) {
                System.out.println(name[i] + " Has A Great Score.");
            } else if (score[i] < 70 && score[i] >= 60) {
                System.out.println(name[i] + " Has A Better Score.");
            } else if (score[i] < 60 && score[i] >= 50) {
                System.out.println(name[i] + " Has A Good Score.");
            } else {
                System.out.println(name[i] + " Has A Worst Score");
            }
        }
    }
}
