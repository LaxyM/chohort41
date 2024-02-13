package lesson_20.HomeWork;

public class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " сейчас кушает.");
    }

    public void sleep() {
        System.out.println(name + " сейчас спит.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String info() {
        return "Имя: " + name + ", Возраст: " + age;
    }
}


