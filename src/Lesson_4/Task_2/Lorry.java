package Lesson_4.Task_2;

public class Lorry extends Car {
    protected float liftingСapacity;

    public Lorry(String carBrand, String carClass, float weight, String engineType, float liftingСapacity) {
        super(carBrand, carClass, weight, engineType);
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
