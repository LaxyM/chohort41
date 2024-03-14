package lesson_41.HomeWork;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
 */
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(34, 17, 13, 4, 78, 65, 25, 2, 97);

        List<Integer> filterNumbers = numbers
                .stream()
                .filter(number -> number > 10)
                .sorted(Comparator.comparingInt(number -> number % 10)) // Сортировка по последней цифре
                .collect(Collectors.toList());

        System.out.println(filterNumbers);
    }
}
