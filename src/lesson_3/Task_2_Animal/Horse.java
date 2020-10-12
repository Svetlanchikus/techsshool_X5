package lesson_3.Task_2_Animal;

import lesson_3.Task_2_Animal.Animal;

public class Horse extends Animal {
    private float speed;

    public Horse(String food, String location, float speed) {
        super(food, location);
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void makeNoise() {
        System.out.println("Кошка ржет");
    }

    public void eat() {
        System.out.println("Лошадь жует " + getFood());
    }
}
