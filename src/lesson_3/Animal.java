package lesson_3;

public class Animal {
    String food;
    String location;

    void makeNoise(String sound) {
        System.out.println("Животное " + sound);
    }

    void eat() {
        System.out.println("Животное ест " + food);
    }

    void sleep(String name) {
        System.out.println(name + " животное спит");
    }
}
