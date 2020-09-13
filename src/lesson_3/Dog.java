package lesson_3;

public class Dog extends Animal {
    float weight;
    boolean trained;

    void makeNoise(float weight) {
        this.weight = weight;
        if (weight <= 3.5) {
            System.out.println("Собака тявкает");
        } else if (weight > 3.5 || weight > 30) {
            System.out.println("Собака гавкает");
        } else {
            System.out.println("Собака лает");
        }
    }

    void eat() {
        System.out.println("Собака грызет " + food);
    }
}
