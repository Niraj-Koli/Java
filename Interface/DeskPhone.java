package Interface;

public class DeskPhone implements ITelephone {
    private static String name;
    private static String model;
    private static int myNumber;
    private boolean isRinging;

    public DeskPhone(String name, String model, int myNumber) {
        this.name = name;
        this.model = model;
        this.myNumber = myNumber;
    }

    public static String getName() {
        return name;
    }

    public static String getModel() {
        return model;
    }

    public static int getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ringing");
        } else {
            isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return true;
    }
}
