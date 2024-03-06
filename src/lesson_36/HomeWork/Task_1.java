package lesson_36.HomeWork;

import java.util.Arrays;
import java.util.Comparator;

/*
Task 1

Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:
Четные целые числа должны идти перед нечетными числами

Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output
 */

public class Task_1 {
    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if ((a % 2 == 0) && (b % 2 != 0)) {
                    return -1;
                } else if ((a % 2 != 0) && (b % 2 == 0)) {
                    return 1;
                } else {
                    return a.compareTo(b);
                }
            }
        };

        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));

    }
}
