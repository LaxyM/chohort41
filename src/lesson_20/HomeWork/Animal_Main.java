package lesson_20.HomeWork;

public class Animal_Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барсик", 3, "Овчарка");
        Cat cat = new Cat("Том", 5, true);

        System.out.println(dog.info());
        dog.eat();
        dog.sleep();
        dog.run();

        System.out.println(cat.info());
        cat.eat();
        cat.sleep();
        cat.meow();


    }
}
