package Lesson_5.Logger;

import Lesson_5.Logger.*;

public class DbLogger implements Logger {
    @Override
    public void log(String massage) {
        System.out.println("Log into database: " + massage);
    }
}
