package Lesson_4.Task_2;

public class Lorry extends Car{
    public float liftingСapacity;

    @Override
    public String start() {
        return "Грузовик поехал";
    }

    @Override
    public String stop() {
        return "Грузовик остановился";
    }
}
