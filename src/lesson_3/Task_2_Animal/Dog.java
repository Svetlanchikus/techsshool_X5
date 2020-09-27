package lesson_3.Task_2_Animal;

import lesson_3.Task_2_Animal.Animal;

public class Dog extends Animal {
    protected float weight;
    protected boolean trained;

    public Dog(String food, String location, float weight, boolean trained) {
        super(food, location);
        this.weight = weight;
        this.trained = trained;
    }

    public Dog(String food, float weight, boolean trained) {
        super(food);
        this.weight = weight;
        this.trained = trained;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public void makeNoise(float weight) {
        this.weight = weight;
        if (weight <= 3.5) {
            System.out.println("Собака тявкает");
        } else if (weight > 3.5 || weight > 30) {
            System.out.println("Собака гавкает");
        } else {
            System.out.println("Собака лает");
        }
    }

    public void eat() {
        System.out.println("Собака грызет " + getFood());
    }
}
