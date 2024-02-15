package lesson_22.HomeWork;

public class Person_Main {
    public static void main(String[] args) {
        Person person = new Person();
        Amateur amateur = new Amateur();
        Professional pro = new Professional();

        System.out.println("Человек:");
        person.run();

        System.out.println("\nЛюбитель:");
        amateur.run();

        System.out.println("\nПрофи:");
        pro.run();
    }

}
