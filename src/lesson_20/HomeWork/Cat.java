package lesson_20.HomeWork;

public class Cat extends Animal {
    private boolean isHappy;

    public Cat(String name, int age, boolean isHappy) {
        super(name, age);
        this.isHappy = isHappy;
    }

    public void meow() {
        System.out.println(getName() + " сейчас мяукает.");
    }


    public String info() {
        return super.info() + ", сейчас счастлив: " + isHappy;
    }
}

