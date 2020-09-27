package Lesson_5.Logger;

import Lesson_5.Logger.*;

public class FileLogger implements Logger {
    @Override
    public void log(String massage) {
        System.out.println("Log into file: " + massage);
    }
}
