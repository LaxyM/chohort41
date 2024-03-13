package lesson_39.HomeWork;

import java.util.HashMap;
import java.util.Map;

/*
Task 1
Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает Map<String, Integer>,
где каждому слову соответствует количество его вхождений в текст.
 */
public class Task_1 {
    public static Map<String, Integer> wordsDictionary(String text) {
        Map<String, Integer> wordCounts = new HashMap<>();

        String[] words = text.split("\\W+");

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            // Если слово уже есть в словаре, увеличиваем его счетчик на 1
            wordCounts.put(lowerCaseWord, wordCounts.getOrDefault(lowerCaseWord, 0) + 1);
        }
        return wordCounts;
    }

    public static void main(String[] args) {
        String text = "Hello, world! World is so beautiful. Hello world again.";
        Map<String, Integer> dictionary = wordsDictionary(text);
        System.out.println(dictionary);
    }
}
