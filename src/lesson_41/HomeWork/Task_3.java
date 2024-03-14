package lesson_41.HomeWork;

import java.util.List;
import java.util.stream.Collectors;

/*
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список
 */
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toList());


        System.out.println(result);
    }
}
