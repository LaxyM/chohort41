package lesson_38;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // Пример использования
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 2, 9);
        List<Integer> uniqueNumbersSorted = getUniqueElementsSorted(numbers);
        System.out.println(uniqueNumbersSorted);  // Выводит список уникальных чисел, отсортированных по убыванию
    }


    public static List<Integer> getUniqueElementsSorted(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        List<Integer> sortedList = new ArrayList<>(set);
        sortedList.sort(Collections.reverseOrder());
        return sortedList;
    }
}