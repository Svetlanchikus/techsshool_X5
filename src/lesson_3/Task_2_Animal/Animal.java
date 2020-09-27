package lesson_3.Task_2_Animal;

public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Animal(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(String sound) {
        System.out.println("Животное " + sound);
    }

    public void eat() {
        System.out.println("Животное ест " + getFood());
    }

    public void sleep(String name) {
        System.out.println(name + " животное спит");
    }
}
