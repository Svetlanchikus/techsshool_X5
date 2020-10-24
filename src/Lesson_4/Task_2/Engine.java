package Lesson_4.Task_2;

public class Engine {
    private float power;
    private String manufacturer;

    public Engine(float power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
