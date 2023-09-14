package MathObject;

public class MathObject {
    public static void main(String[] args) {
        double x = 7;
        double y = 10;

        System.out.println("Max Number: " + Math.max(x, y));
        System.out.println("Square root: " + Math.sqrt(y));
        System.out.println("Power: " + Math.pow(x, y));
        System.out.println("Logarithm: " + Math.log(y));
        System.out.println("Logarithm 10: " + Math.log10(y));
        System.out.println("Logarithm y + 1: " + Math.log1p(y));
        System.out.println("Exponential: " + Math.exp(x));
        System.out.println("Exponential - 1: " + Math.expm1(x));
        System.out.println("Sine: " + Math.sin(x));
        System.out.println("Inverse Cosine: " + Math.acos(x));
        System.out.println("Hyperbolic Tangent: " + Math.tanh(x));
        System.out.println("ToDegrees: " + Math.toDegrees(y));
        System.out.println("ToRadians: " + Math.toRadians(y));
    }
}
