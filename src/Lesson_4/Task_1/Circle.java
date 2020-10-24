package Lesson_4.Task_1;

public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return radius * radius * Math.PI;
    }
}
