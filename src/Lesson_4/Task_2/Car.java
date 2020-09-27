package Lesson_4.Task_2;

public abstract class Car {
    protected String carBrand;
    protected String carClass;
    protected float weight;
    protected String engineType;

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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Car(String carBrand, String carClass, float weight, String engineType) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.engineType = engineType;
    }

    public abstract String start();

    public abstract String stop();

    public String turnRight() {
        return "Поворот направо ";
    }

    public String turnLeft() {
        return "Поворот налево ";
    }

    public String printInfo() {
        return "Автомобиль марки" + getCarBrand() + ", класс " + getCarClass() + ", вес " + getWeight() + ", тип мотора " + getEngineType();
    }

}
