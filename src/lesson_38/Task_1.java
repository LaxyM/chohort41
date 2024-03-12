package lesson_38;

import java.util.*;

public class Task_1 {
    public static List<String> getUniqueSortedWords(String input) {
        // Удаление знаков препинания и приведение строки к нижнему регистру для унификации
        String sanitizedInput = input.replaceAll("[^\\p{L}\\p{Nd}]+", " ").toLowerCase();

        // Разделение строки на слова и удаление дубликатов
        List<String> words = new ArrayList<>(new HashSet<>(Arrays.asList(sanitizedInput.split("\\s+"))));

        // Сортировка слов по длине и лексикографически
        words.sort((word1, word2) -> {
            if (word1.length() != word2.length()) {
                return Integer.compare(word1.length(), word2.length());
            } else {
                return word1.compareTo(word2);
            }
        });

        return words;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }
}
