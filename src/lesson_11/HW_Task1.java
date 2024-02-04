package lesson_11;

import java.util.Scanner;

public class HW_Task1 {
    // Task 1: Проверка на простое число
    public static boolean primeNumber(int numbers) {
        if (numbers <= 0) {
            return false;
        }
        for (int i = 2; i < numbers; i++) {
            if (numbers % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число для проверки на простоту: ");
        int inputNumber = scanner.nextInt();

        // Проверка числа на простоту
        boolean isPrimeResult = primeNumber(inputNumber);

        // Вывод результата в консоль
        if (isPrimeResult) {
            System.out.println(inputNumber + " является простым числом.");
        } else {
            System.out.println(inputNumber + " не является простым числом.");
        }
    }
}

