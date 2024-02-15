package lesson_22.HomeWork;

public class Professional extends Amateur {
    @Override
    public void run() {
        System.out.println("Профи бежит 25 км в час");
        rest();
    }

    @Override
    public void rest() {
        System.out.println("Профи отдыхает 5 минут");
    }
}
