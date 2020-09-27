package Lesson_5.Computer;

public class Процессор {
    protected double тактоваяЧастота;
    protected int количествоЯдер;
    protected double кешПамяти;
    protected String название;
    protected String производитель;

    public void запуститьПроцессор() {
        System.out.println("Происходит подача тока в процессор");
    }
}
