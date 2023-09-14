package Composition;

public class Composition {
    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard("B550", "Asus", 4, 6, "w3.7");
        System.out.println("Motherboard: ");
        System.out.println("Model: " + motherboard.getModel());
        System.out.println("Manufacturer: " + motherboard.getManufacturer());
        System.out.println("Ram Slots: " + motherboard.getRamSlots());
        System.out.println("Card Slots: " + motherboard.getCardSlots());
        System.out.println("Bios: " + motherboard.getBios());

        System.out.println();

        Monitor monitor = new Monitor("Inspiron", "Dell", 28, new Resolution(1600, 900));
        System.out.println("Monitor: ");
        System.out.println("Model: " + monitor.getModel());
        System.out.println("Manufacturer: " + monitor.getManufacturer());
        System.out.println("Size: " + monitor.getSize());
        System.out.println("Width: " + monitor.getNativeResolution().getWidth());
        System.out.println("Height: " + monitor.getNativeResolution().getHeight());

        System.out.println();

        Mouse mouse = new Mouse("G402", "Logitech", 7, new Color("Blue", "Red", 60));
        System.out.println("Mouse:");
        System.out.println("Model: " + mouse.getModel());
        System.out.println("Manufacturer: " + mouse.getManufacturer());
        System.out.println("Size: " + mouse.getSize());
        System.out.println("Current Colour: " + mouse.getEffects().getCurrentColor());
        System.out.println("Next Colour: " + mouse.getEffects().getNextColor());
        System.out.println("Duration: " + mouse.getEffects().getDuration());

        System.out.println();

        PC pc = new PC(mouse, monitor, motherboard);

        System.out.println("Doing some tasks through PC");

        pc.getMotherboard().loadProgram("Vscode");

        pc.getMonitor().drawPixelAt(345, 890, "Purple");

        pc.getMouse().changeDpi(800);

        pc.line();
    }
}
