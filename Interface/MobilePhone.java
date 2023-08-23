package Interface;

public class MobilePhone implements ITelephone {
    private static String name;
    private static String model;
    private static int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(String name, String model, int myNumber) {
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
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
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
        return false;
    }
}
