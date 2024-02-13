package lesson_20.HomeWork;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void run() {
        System.out.println(getName() + " сейчас бегает.");
    }


    public String info() {
        return super.info() + ", Порода: " + breed;
    }
}

