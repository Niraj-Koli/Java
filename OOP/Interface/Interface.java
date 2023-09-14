package Interface;

public class Interface {
    public static void main(String[] args) {
        ITelephone epsilonPhone;
        epsilonPhone = new DeskPhone("Nova", "Black Tiered", 21735);

        System.out.println("===== Desk Phone =====");
        System.out.println("Name: " + DeskPhone.getName());
        System.out.println("Model: " + DeskPhone.getModel());
        System.out.println("Number: " + DeskPhone.getMyNumber());
        epsilonPhone.powerOn();
        epsilonPhone.dial(85104);
        epsilonPhone.isRinging();
        epsilonPhone.answer();
        epsilonPhone.callPhone(94124);

        System.out.println();

        epsilonPhone = new MobilePhone("Sigma", "Note 9 Pro", 480974125);

        System.out.println("===== Mobile Phone =====");
        System.out.println("Name: " + MobilePhone.getName());
        System.out.println("Model: " + MobilePhone.getModel());
        System.out.println("Number: " + MobilePhone.getMyNumber());
        epsilonPhone.powerOn();
        epsilonPhone.dial(1264125042);
        epsilonPhone.isRinging();
        epsilonPhone.answer();
        epsilonPhone.callPhone(941094224);
    }
}
