package lesson_3;

import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int group;
    private double averageMark;
    double scholarship;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public double getScholarship() {
        if (getAverageMark() == 0) {
            System.out.println("Укажите средний балл студента " + firstName + " от 0 до 5");
            Scanner in = new Scanner(System.in);
            setAverageMark(in.nextDouble());
        }
        if (getAverageMark() == 5) {
            return scholarship = 100;
        } else {
            return scholarship = 80;
        }
    }


}
