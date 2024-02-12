package lesson_19.HomeWork;

public class Counter_Main {
    public static void main(String[] args) {
        // Пример использования класса Counter
        Counter counter = new Counter();
        System.out.println("Значение счётчика: " + counter.getValue());

        counter.increment();
        System.out.println("Увиличение на один: " + counter.getValue());

        counter.decrement();
        System.out.println("Уменьшение на один: " + counter.getValue());

    }
}
