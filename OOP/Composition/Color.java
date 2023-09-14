package Composition;

public class Color {
    private String currentColor;
    private String nextColor;
    private int duration;

    public Color(String currentColor, String nextColor, int duration) {
        this.currentColor = currentColor;
        this.nextColor = nextColor;
        this.duration = duration;
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public String getNextColor() {
        return nextColor;
    }

    public int getDuration() {
        return duration;
    }
}
