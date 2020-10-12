package lesson_3.Task_2_Animal;

import lesson_3.Task_2_Animal.Animal;

public class Cat extends Animal {
    private boolean catchesMice;

    public Cat(String food, String location, boolean catchesMice) {
        super(food, location);
        this.catchesMice = catchesMice;
    }

    public Cat(String food, boolean catchesMice) {
        super(food);
        this.catchesMice = catchesMice;
    }

    public boolean isCatchesMice() {
        return catchesMice;
    }

    public void setCatchesMice(boolean catchesMice) {
        this.catchesMice = catchesMice;
    }

    public void makeNoise(String sound) {
        System.out.println("Кошка " + sound);
    }

    public void eat() {
        System.out.println("Кошка грызет " + getFood());
    }
}
