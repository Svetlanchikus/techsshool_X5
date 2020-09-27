package Lesson_5.Logger;

import Lesson_5.Logger.*;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
