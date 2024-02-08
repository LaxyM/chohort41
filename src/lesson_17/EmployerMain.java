package lesson_17;

public class EmployerMain {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Johnny Depp", 30, 500.50);
        employer1.info();

        // использования сеттеров
        employer1.setMoney(300.80);
        employer1.info();

        System.out.println();

        Employer employer2 = new Employer("Monica Bellucci", 25, 645.20);
        employer2.info();

        System.out.println();

        Employer employer3 = new Employer("Boris Johnson", 35, 320.50);
        employer3.info();
    }
}