package lesson_3;

public class Lesson3 {
    public static void main(String[] args) {

        // Данные для задания Phone

        Phone one = new Phone();
        one.number = "+7(916)633-11-11";
        one.model = "Apple iPhone 11 Pro 64GB Midnight Green";
        one.weight = 194;

        lesson_3.Phone two = new lesson_3.Phone("+7(916)633-22-22", "Xiaomi Redmi 7A");
        two.weight = 213;

        lesson_3.Phone three = new lesson_3.Phone("+7(916)633-33-33", "Samsung Galaxy Fold", 205);

        System.out.println(one.number + ", " + one.model + ", " + one.weight);
        System.out.println(two.number + ", " + two.model + ", " + two.weight);
        System.out.println(three.number + ", " + three.model + ", " + three.weight);

        one.receiveCall("Вася");
        two.receiveCall("Инна");
        three.receiveCall("Света");

        System.out.println(one.getNumber());
        System.out.println(two.getNumber());
        System.out.println(three.getNumber());

        one.receiveCall(559635);
        two.receiveCall(89021655789L);
        three.receiveCall(5408865965L);

        one.sendMassege(557896L, 55786L);
        two.sendMassege(5572535386L);
        three.sendMassege(557896L, 55786L, 5655566);

        //Данные для задания Animal

        Animal[] animals = new Animal[3];

        animals[0] = new Cat();
        animals[0].food = "meat";
        animals[0].location = "Moscow";

        animals[1] = new Dog();
        animals[1].food = "meat";
        animals[1].location = "London";

        animals[2] = new Horse();
        animals[2].food = "grass";
        animals[2].location = "Uryupinsk";

        Veterinarian reception = new Veterinarian();

        for (int i = 0; i < 3; i++) {
            reception.treatAnimal(animals[i]);
        }

        //Данные для задания Student

        Student Ivanov1 = new Aspirant("Ivanov", "Ivan", 2202);

        Student[] room22 = new Student[3];
        room22[0] = new Student("Petrov", "Mark", 2203);
        room22[1] = new Student("Sidorov", "Stepan", 4203);
        room22[2] = new Aspirant("Verxov", "Slava", 2590);

        room22[0].getScholarship();

        for (int i = 0; i < 3; i++) {
            System.out.println(room22[i].getScholarship());
        }
    }
}

