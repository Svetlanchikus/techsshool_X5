package Lesson_4.Task_2;

public class Lorry extends Car {
    private float liftingСapacity;

    public Lorry(String carBrand, String carClass, float weight, float power, String manufacturer, float liftingСapacity) {
        super(carBrand, carClass, weight, power, manufacturer);
        this.liftingСapacity = liftingСapacity;
    }

    public float getLiftingСapacity() {
        return liftingСapacity;
    }

    public void setLiftingСapacity(float liftingСapacity) {
        this.liftingСapacity = liftingСapacity;
    }

    @Override
    public String start() {
        return "Грузовик поехал ";
    }

    @Override
    public String stop() {
        return "Грузовик остановился ";
    }
}
