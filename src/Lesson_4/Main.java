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
        shape[0] = new Circle();
        shape[1] = new Triangle();
        shape[2] = new Rectangle();
        for (Shape sh : shape) {
            System.out.println("Площадь фиругы: " + sh.square());
        }

        //Данные для задания 2
        Car[] car = new Car[2];
        car[0] = new Lorry("Man", "C", 5000f, "Diesel", 6000f);
        car[1] = new SportCar("liftingСapacity", "A", 1000f, "petrol", 120.6f);
        for (Car cr : car) {
            System.out.println(cr.printInfo() + ": " + cr.start() + cr.turnRight() + cr.turnLeft() + cr.stop());
        }

    }
}
