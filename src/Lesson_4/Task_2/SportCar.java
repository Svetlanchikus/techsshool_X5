package Lesson_4.Task_2;

public class SportCar extends Car{
    public float сloseSpeed;

    public SportCar(float сloseSpeed) {
        this.сloseSpeed = сloseSpeed;
    }

    @Override
    public String start() {
        return "SportCar поехал со скорстью " + сloseSpeed;
    }

    @Override
    public String stop() {
        return "SportCar остановилсясо скорстью " + сloseSpeed;
    }
}
