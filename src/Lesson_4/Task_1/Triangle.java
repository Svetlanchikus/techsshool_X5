package Lesson_4.Task_1;

import java.util.Scanner;

public class Triangle implements Shape {

    @Override
    public double square() {
        System.out.println("Укажите, пожалуйста, длины трех сторон треугольника ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        return (a + b + c) / 2;
    }
}
