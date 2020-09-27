package lesson_3.Task_2_Animal;

import lesson_3.Task_2_Animal.Animal;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood());
        System.out.println(animal.getLocation());
    }
}
