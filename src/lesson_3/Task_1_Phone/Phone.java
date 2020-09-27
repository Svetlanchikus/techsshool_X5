package lesson_3.Task_1_Phone;

public class Phone {

    protected String number;
    protected String model;
    protected float weight;

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.model = "iPhone 1";
        this.weight = 3.2f;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(long numberRinging) {
        System.out.println("Звонит " + numberRinging);
    }

    public void sendMassege(long... v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("Сообщение отправлено " + v[i]);
        }
    }
}
