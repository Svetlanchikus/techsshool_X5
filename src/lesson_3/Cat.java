package lesson_3;

public class Cat extends Animal {
    boolean catchesMice;

    void makeNoise(String sound) {
        System.out.println("Кошка " + sound);
    }

    void eat() {
        System.out.println("Кошка грызет " + food);
    }
}
