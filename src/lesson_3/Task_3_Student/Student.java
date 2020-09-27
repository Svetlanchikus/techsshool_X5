package lesson_3.Task_3_Student;

import java.util.Scanner;

public class Student {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected double averageMark;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    public double getAverageMark() {
        return averageMark;
    }

    public void scannerAverageMark() {
        System.out.println("Укажите средний балл студента " + getLastName() + " от 0 до 5");
        Scanner in = new Scanner(System.in);
        setAverageMark(in.nextDouble());
    }

    public double getScholarship() {
        if (getAverageMark() == 0) {
            scannerAverageMark();
        }
        if (getAverageMark() == 5) {
            return 100;
        } else {
            return 80;
        }
    }


}
