package lesson_22.HomeWork;

public class Amateur extends Person {
    @Override
    public void run() {
        System.out.println("Любитель бежит 15 км в час");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Любитель отдыхает 10 минут");
    }
}