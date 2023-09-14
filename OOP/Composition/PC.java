package Composition;

public class PC {
    private Mouse mouse;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Mouse mouse, Monitor monitor, Motherboard motherboard) {
        this.mouse = mouse;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void line() {
        monitor.drawline(3, 4, 7, 9);
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
