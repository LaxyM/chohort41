package lesson_09;

import java.util.Arrays;
import java.util.Random;
/*
Заполните массив 20 случайными целыми числами.
Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
 */
public class HW_Task0 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Генерация случайного числа от 0 до 99
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));


        int countEven = 0;
        int sumEven = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                countEven++;
                sumEven += num;
            }
        }

        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Сумма четных чисел: " + sumEven);
    }
}
