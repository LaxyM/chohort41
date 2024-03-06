package lesson_36.HomeWork;

import java.util.Arrays;
import java.util.Comparator;
/*
Task 2
Напишите MyComparator2 с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами в порядке возрастания.
Нечетные целые числа должны идти после четных в порядке убывания
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Output
 */
public class Task_2 {

    public static void main(String[] args) {
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (a % 2 == 0 && b % 2 == 0) { // оба четные
                    return a.compareTo(b);
                } else if (a % 2 != 0 && b % 2 != 0) { // оба нечетные
                    return b.compareTo(a);
                } else if (a % 2 == 0) { // a четное, b нечетное
                    return -1; //
                } else { // a нечетное, b четное
                    return 1;
                }
            }
        };

        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));
    }
}

