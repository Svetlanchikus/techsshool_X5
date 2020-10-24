package Lesson_4.Task_1;

import java.util.Scanner;

public class Rectangle implements Shape {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a * b;
    }
}
