package lesson_40.HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/*
Дан список строк. Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A"),
удалите дубликаты и отсортируйте их в алфавитном порядке.
 */
public class Task_4 {
    // Метод для фильтрации строк по первой букве
    public static List<String> filterByFirstLetter(List<String> strings, char targetLetter) {
        Predicate<String> startTargetLetter = s -> s.charAt(0) == targetLetter;

        return strings.stream()
                .filter(startTargetLetter)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Banana", "Apricot", "Avocado", "Banana", "Grapes");

        char targetLetter = 'A';

        List<String> filteredAndSorted = filterByFirstLetter(strings, targetLetter);
        System.out.println(filteredAndSorted);
    }
}
