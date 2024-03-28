package lesson_42.HomeWork;

import java.util.Arrays;
/*
Разбейте строку на слова, используя в качестве разделителя пробел.
Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
 */
public class Task_0 {
    public static void main(String[] args) {
        String text = "Hello, world and good! afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);
    }

    public static int countLetters(String text) {
        return Arrays
                .stream(text.split(" "))
                .map(word -> word.replaceAll("[^a-zA-Z]", ""))
                .filter(word -> word.length() > 4)
                .mapToInt(String::length)
                .peek(System.out::println)
                .reduce(0, Integer::sum); // Суммируем длины
    }
}