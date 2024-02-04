package lesson_13;

import java.util.ArrayList;
/*
Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив,
состоящий только из простых чисел, присутствующих в изначальном массиве

вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
 */

public class HW_Task1 {
    public static void main(String[] args) {
        int[] inputArray = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        int[] resultArray = filterNum(inputArray);

        // Вывод результата
        System.out.print("{");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Метод для фильтрации простых чисел из массива
    public static int[] filterNum(int[] inputArray) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int number : inputArray) {
            if (prime(number)) {
                primeNumbers.add(number);
            }
        }

        // Преобразование ArrayList в массив
        int[] resultArray = new int[primeNumbers.size()];
        for (int i = 0; i < primeNumbers.size(); i++) {
            resultArray[i] = primeNumbers.get(i);
        }

        return resultArray;
    }

    // Метод для проверки, является ли число простым
    public static boolean prime(int numbers) {
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
}
