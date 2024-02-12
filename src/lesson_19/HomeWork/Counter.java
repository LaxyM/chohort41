package lesson_19.HomeWork;

/* Task 1: Класс "Счётчик"
Класс "Счётчик" Разработайте класс Counter, который позволяет создавать объекты-счётчики
с возможностью увеличения и уменьшения значения счётчика. В классе должны быть:

--Поле value для хранения текущего значения счётчика.
--Методы increment() и decrement(), увеличивающие и уменьшающие значение счётчика соответственно.
--Метод getValue() для получения текущего значения счётчика.
 */
public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    // Метод увеличения значения +1
    public void increment() {
        value++;

    }

    // Метод уменьшения значения -1
    public void decrement() {
        value--;
    }

    // Метод получает результат
    public int getValue() {
        return value;
    }
}
