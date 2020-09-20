package Lesson_4.Task_1;

import java.util.Scanner;

public class Rectangle implements Shape {
    @Override
    public double square() {
        System.out.println("Укажите, пожалуйста, длины двух сторон прямоугольника ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        return a * b;
    }
}
