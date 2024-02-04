package lesson_11;

import java.util.Scanner;

public class HW_Task2 {
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

    // Task 2: Подсчет простых чисел в массиве
    public static int countIfPrime(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (primeNumber(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива чисел от пользователя
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Подсчет простых чисел в массиве
        int primeCount = countIfPrime(array);

        // Вывод результата в консоль
        System.out.println("Количество простых чисел в массиве: " + primeCount);
    }
}

