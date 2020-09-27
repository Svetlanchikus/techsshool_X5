package lesson_3;

import lesson_3.Task_1_Phone.Phone;
import lesson_3.Task_2_Animal.*;
import lesson_3.Task_3_Student.Aspirant;
import lesson_3.Task_3_Student.Student;

public class Lesson3 {

    public static void main(String[] args) {

        // Данные для задания Phone

        Phone[] phones = new Phone[3];

        phones[0] = new Phone();
        phones[0].setNumber("+7(916)633-11-11");
        //one.model = "Apple iPhone 11 Pro 64GB Midnight Green";
        //one.weight = 194;

        phones[1] = new Phone("+7(916)633-22-22", "Xiaomi Redmi 7A");
        phones[1].setWeight(213f);

        phones[2] = new Phone("+7(916)633-33-33", "Samsung Galaxy Fold", 205);

        for (int i = 0; i < 3; i++) {
            System.out.println(phones[i].getNumber() + ", " + phones[i].getModel() + ", " + phones[i].getWeight());
        }

        phones[0].receiveCall("Вася");
        phones[1].receiveCall("Инна");
        phones[2].receiveCall("Света");

        for (int i = 0; i < 3; i++) {
            System.out.println(phones[i].getNumber());
        }

        phones[0].receiveCall(559635);
        phones[1].receiveCall(89021655789L);
        phones[2].receiveCall(5408865965L);

        phones[0].sendMassege(557896L, 55786L);
        phones[1].sendMassege(5572535386L);
        phones[2].sendMassege(557896L, 55786L, 5655566);

        //Данные для задания Animal

        Animal[] animals = new Animal[3];

        animals[0] = new Cat("meat", "Moscow", true);

        animals[1] = new Dog("meat", "London", 3.5f, true);

        animals[2] = new Horse("grass", "Uryupinsk", 20.3f);

        Veterinarian reception = new Veterinarian();

        for (int i = 0; i < 3; i++) {
            reception.treatAnimal(animals[i]);
        }

        //Данные для задания Student

        Student Ivanov1 = new Aspirant("Ivanov", "Ivan", 2202, "Dynamic structures");

        Student[] room22 = new Student[3];
        room22[0] = new Student("Petrov", "Mark", 2203);
        room22[1] = new Student("Sidorov", "Stepan", 4203);
        room22[2] = new Aspirant("Verxov", "Slava", 2590, "branches and sticks");

        room22[0].getScholarship();

        for (int i = 0; i < 3; i++) {
            System.out.println(room22[i].getScholarship());
        }
    }
}

