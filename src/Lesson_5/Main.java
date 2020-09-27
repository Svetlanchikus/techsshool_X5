package Lesson_5;

import Lesson_5.Logger.*;
import Lesson_5.Computer.*;

public class Main {

    public static void main(String[] args) {
        //Задание Logger
        Сalculator calculator = new Сalculator(0, 5);
        calculator.addition();
        calculator.subtraction();
        calculator.multiplication();
        calculator.division();

        //Задание Computer
        Компьютер computer = new Компьютер();
        computer.включить();


    }
}
