package Lesson_4.Task_1;

import java.util.Scanner;

public class Circle implements Shape {

    @Override
    public double square() {
        System.out.println("Укажите, пожалуйста, длину радиусу круга ");
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        return radius * radius * Math.PI;
    }
}
