package lesson_41.HomeWork;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.
 */
public class Task_2 {
    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Orange", "Banana", "Strawberry");

        Optional<String> longestString = strings
                .stream()
                .max(Comparator.comparingInt(String::length));

        if (longestString.isPresent()) {
            System.out.println("Строка с максимальной длиной: " + longestString.get());
        } else {
            System.out.println("Список пуст");
        }
    }
}
