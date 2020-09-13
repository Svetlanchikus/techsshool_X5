package lesson_3;

public class Phone {

    String number;
    String model;
    float weight;

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name); }

    void receiveCall(long numberRinging) {
        System.out.println("Звонит " + numberRinging);
    }

    public String getNumber() {
        return number;
    }

    void sendMassege(long... v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Сообщение отправлено " + v[i]);
        }
    }
}
