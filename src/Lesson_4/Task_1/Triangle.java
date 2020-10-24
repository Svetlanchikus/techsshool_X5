package Lesson_4.Task_1;

import java.util.Scanner;

public class Triangle implements Shape {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        return (a + b + c) / 2;
    }

}
