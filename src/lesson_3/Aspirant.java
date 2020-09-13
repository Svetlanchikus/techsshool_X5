package lesson_3;

import java.util.Scanner;

public class Aspirant extends Student {

    String scientificWork;

    public Aspirant(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }


    public double getScholarship() {
        if (getAverageMark() == 0) {
            System.out.println("Укажите средний балл асперанта " + firstName + " от 0 до 5");
            Scanner in = new Scanner(System.in);
            setAverageMark(in.nextDouble());
        }
        if (super.getAverageMark() == 5) {
            return scholarship = 200;
        } else {
            return scholarship = 180;
        }
    }
}
