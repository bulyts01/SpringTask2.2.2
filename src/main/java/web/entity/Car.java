package web.entity;

public class Car {
    private String color;
    private String model;
    private int serial;

    public Car() {
    }

    public Car(String color, String model, int serial) {
        this.color = color;
        this.model = model;
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
               "color='" + color + '\'' +
               ", model='" + model + '\'' +
               ", serial=" + serial +
               '}';
    }
}
