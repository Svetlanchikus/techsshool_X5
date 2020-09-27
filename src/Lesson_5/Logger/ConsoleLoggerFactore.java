package Lesson_5.Logger;

import Lesson_5.Logger.*;

public class ConsoleLoggerFactore extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
