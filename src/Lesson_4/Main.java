package Lesson_4;

import Lesson_4.Task_1.Circle;
import Lesson_4.Task_1.Rectangle;
import Lesson_4.Task_1.Shape;
import Lesson_4.Task_1.Triangle;

public class Main {
    public static void main(String args[]) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Triangle();
        shape[2] = new Rectangle();
        for (Shape sh : shape) {
            System.out.println("Площадь фиругы: " + sh.square());
        }
    }
}
