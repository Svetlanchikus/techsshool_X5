package lesson_3.Task_3_Student;

import java.util.Scanner;

public class Aspirant extends Student {

    private String scientificWork;

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public Aspirant(String firstName, String lastName, int group, String scientificWork) {
        super(firstName, lastName, group);
        this.scientificWork = scientificWork;
    }

    public double getScholarship() {
        if (getAverageMark() == 0) {
            scannerAverageMark();
        }
        if (super.getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
