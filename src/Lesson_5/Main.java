package Lesson_5;

import Lesson_5.Logger.*;
import Lesson_5.Computer.*;

import static Lesson_5.Computer.CompType.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание Logger");

        Сalculator calculator = new Сalculator(0, 5);
        System.out.println(calculator.addition());
        System.out.println(calculator.subtraction());
        System.out.println(calculator.multiplication());
        System.out.println(calculator.division());


        System.out.println("Задание computer");
        Computer computer = new Computer(Personal);
        computer.turnOn();
    }
}
