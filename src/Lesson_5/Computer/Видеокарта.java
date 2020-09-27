package Lesson_5.Computer;

public class Видеокарта {
    protected String производитель;
    protected double ОбъемПамяти;
    protected String типПамяти;
    protected boolean активноеОхлождение;

    public void запуститьВидеокарта() {
        System.out.println("Происходит подача тока в видеокарту");
    }
}
