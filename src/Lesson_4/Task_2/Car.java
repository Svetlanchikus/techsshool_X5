package Lesson_4.Task_2;

public abstract class Car {
    public String carBrand;
    public String carClass;
    public float weight;
    public String engineType;

    public abstract String start();
    public abstract String stop();

    public String turnRight(){
        return "Поворот направо";
    }

    public String turnLeft(){
        return "Поворот налево";
    }

    public String printInfo(){
        return "Автомобиль марки" + carBrand + ", класс " + carClass + ", вес " + weight + ", тип мотора " + engineType;
    }

}
