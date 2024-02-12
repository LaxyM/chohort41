package lesson_19.HomeWork;

/* Task 2: Класс "Калькулятор"

Создайте класс Calculator, который будет предоставлять базовые арифметические операции:
сложение, вычитание, умножение и деление.

Класс должен содержать: Статические методы для каждой операции,
принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {
    // Метод "сложение"
    public static int addition(int a, int b) {
        return a + b;
    }

    // Метод "вычитание"
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // Метод "умножение"
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Метод "деление"
    public static double division(int a, int b) {
        return (double) a / b;
    }
}