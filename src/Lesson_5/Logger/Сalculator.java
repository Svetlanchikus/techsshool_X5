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

    public double getSecondVariable() {
        return secondVariable;
    }

    LoggerFactory factory = new FileLoggerFactory();
    Logger logger = factory.createLogger();

    public double addition() {
        double result = getFirstVariable() + getSecondVariable();
        logger.log("Результат сложения: " + result);
        return result;
    }

    public double subtraction() {
        double result = getFirstVariable() - getSecondVariable();
        logger.log("Результат вычитания: " + result);
        return result;
    }

    public double multiplication() {
        double result = getFirstVariable() * getSecondVariable();
        logger.log("Результат умножения: " + result);
        return result;
    }

    public double division() {
        double result = getFirstVariable() / getSecondVariable();
        logger.log("Результат деления: " + result);
        return result;
    }

}

