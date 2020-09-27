package Lesson_5.Logger;

public class Сalculator {
    private double firstVariable;
    private double secondVariable;

    public Сalculator(double firstVariable, double secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public double getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(double firstVariable) {
        this.firstVariable = firstVariable;
    }

    public double getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(double secondVariable) {
        this.secondVariable = secondVariable;
    }

    public void addition() {
        LoggerFactory factory = null;

        if (getFirstVariable() == 0 && getSecondVariable() == 0) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("Суммирование не производится. Значение равно 0");
        } else if (getFirstVariable() == 0 && getSecondVariable() != 0) {
            factory = new FileLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Запись в файл второго значения " + getSecondVariable());
        } else if (getFirstVariable() != 0 && getSecondVariable() == 0) {
            factory = new FileLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Запись в файл первого значения " + getFirstVariable());
        } else {
            factory = new DbLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Производится запись в БД суммы первого и второго аргумента равна: " + (getFirstVariable() + getSecondVariable()));
        }
    }

    public void subtraction() {
        LoggerFactory factory = null;

        if (getFirstVariable() == 0 && getSecondVariable() == 0) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("Вычитание не производится. Значение равно 0");
        } else if (getFirstVariable() == 0 && getSecondVariable() != 0) {
            factory = new FileLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Запись в файл отрицательного второго значения " + getSecondVariable());
        } else if (getFirstVariable() != 0 && getSecondVariable() == 0) {
            factory = new FileLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Запись в файл первого значения " + getFirstVariable());
        } else if (getFirstVariable() < getSecondVariable()) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("При вычислении получается отрицательное значение: " + (getFirstVariable() - getSecondVariable()));
        } else {
            factory = new DbLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Производится запись в БД вычитания из первого аргумента второго: " + (getFirstVariable() * getSecondVariable()));
        }
    }

    public void multiplication() {
        LoggerFactory factory = null;

        if (getFirstVariable() == 0 || getSecondVariable() == 0) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("Умножение не производится. Значение равно 0");
        } else {
            factory = new DbLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Производится запись в БД произведения первого и второго аргумента равна: " + (getFirstVariable() * getSecondVariable()));
        }
    }

    public void division() {
        LoggerFactory factory = null;

        if (getFirstVariable() == 0 && getSecondVariable() == 0) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("Деление не производится. Значение равно 0");
        } else if (getFirstVariable() == 0 && getSecondVariable() != 0) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("Деление не производится. Значение равно 0");
        } else if (getFirstVariable() != 0 && getSecondVariable() == 0) {
            factory = new ConsoleLoggerFactore();
            Logger logger = factory.createLogger();
            logger.log("Ошибка. Деление на ноль недопустимо");
        } else {
            factory = new DbLoggerFactory();
            Logger logger = factory.createLogger();
            logger.log("Производится запись в БД значения деления первого и второго аргумента: " + (getFirstVariable() / getSecondVariable()));
        }
    }

}

