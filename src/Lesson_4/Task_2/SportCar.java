package Lesson_4.Task_2;

public class SportCar extends Car {
    protected float сloseSpeed;

    public SportCar(String carBrand, String carClass, float weight, String engineType, float сloseSpeed) {
        super(carBrand, carClass, weight, engineType);
        this.сloseSpeed = сloseSpeed;
    }

    public float getСloseSpeed() {
        return сloseSpeed;
    }

    public void setСloseSpeed(float сloseSpeed) {
        this.сloseSpeed = сloseSpeed;
    }

    @Override
    public String start() {
        return "SportCar поехал со скорстью " + getСloseSpeed();
    }

    @Override
    public String stop() {
        return "SportCar остановилсясо скорстью " + getСloseSpeed();
    }
}
