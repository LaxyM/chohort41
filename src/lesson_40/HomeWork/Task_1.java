package lesson_40.HomeWork;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть четными, больше 10 и меньше 100
 */
public class Task_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 12, 65, 102, 34, 9, 8, 76, 200, 122, 53, 14, 44);

        List<Integer> filteredNumbers = filterNumbers(numbers);

        System.out.println(filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers) {
        Predicate<Integer> isEven = n -> n % 2 == 0; // Четное число
        Predicate<Integer> isGreaterThan10 = n -> n > 10; // Больше 10
        Predicate<Integer> isLessThan100 = n -> n < 100; // Меньше 100


        return numbers.stream()
                .filter(isEven.and(isGreaterThan10).and(isLessThan100))
                .sorted()
                .collect(Collectors.toList());
    }
}
