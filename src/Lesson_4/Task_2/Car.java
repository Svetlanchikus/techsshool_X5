package Lesson_4.Task_2;

public abstract class Car {
    protected String carBrand;
    protected String carClass;
    protected float weight;
    protected Engine motor;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Car(String carBrand, String carClass, float weight, float power, String manufacturer) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = new Engine(power, manufacturer);
    }

    public abstract String start();

    public abstract String stop();

    public String turnRight() {
        return " Поворот направо, ";
    }

    public String turnLeft() {
        return " Поворот налево, ";
    }

    public String printInfo() {
        return "Автомобиль марки" + getCarBrand() + ", класс " + getCarClass() + ", вес " + getWeight() + ", мощность мотора " + motor.getPower() + ", производитель мотора " + motor.getManufacturer();
    }

}
