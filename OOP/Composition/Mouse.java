package Composition;

public class Mouse {

    private String model;
    private String manufacturer;
    private int size;
    private Color effects;

    public Mouse(String model, String manufacturer, int size, Color effects) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.effects = effects;
    }

    public void changeDpi(int dpi) {
        System.out.println("Dpi change to " + dpi);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Color getEffects() {
        return effects;
    }
}
