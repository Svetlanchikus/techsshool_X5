package Lesson_4;

import Lesson_4.Task_1.Circle;
import Lesson_4.Task_1.Rectangle;
import Lesson_4.Task_1.Shape;
import Lesson_4.Task_1.Triangle;
import Lesson_4.Task_2.Car;
import Lesson_4.Task_2.Engine;
import Lesson_4.Task_2.Lorry;
import Lesson_4.Task_2.SportCar;


public class Main {
    public static void main(String args[]) {

        //Данные для задания 1
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3.5f);
        shape[1] = new Triangle(3f, 5f, 2.3f);
        shape[2] = new Rectangle(3f, 5.6f);
        for (Shape sh : shape) {
            System.out.println("Площадь фиругы: " + sh.square());
        }

        //Данные для задания 2
        Car[] car = new Car[2];
        car[0] = new Lorry("Man", "C", 5000f, 3.5f, "Diesel", 6000f);
        car[1] = new SportCar("liftingСapacity", "A", 1000f, 5.6f, "petrol", 120.6f);
        for (Car cr : car) {
            System.out.println(cr.printInfo() + ": " + cr.start() + cr.turnRight() + cr.turnLeft() + cr.stop());
        }

    }
}
