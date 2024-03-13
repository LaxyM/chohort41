package lesson_40.HomeWork;
/*
Создайте цепочку функций, которая сначала удаляет пробелы из строки,
затем преобразует её в верхний регистр, и в конце считает количество символов в измененной строке.


 */
public class Task_2 {
    public static void main(String[] args) {
        String input = "Пример строки   с   большими   пробелами";

        // Вызов цепочки
        int result = countCharacters(convertToUpperCase(removeSpaces(input)));

        System.out.println("Количество символов в измененной строке: " + result);
    }

    // Удаление пробелов из строки
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s", "");
    }

    // Преобразование строки в верхний регистр
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    // Подсчет количества символов в строке
    public static int countCharacters(String str) {
        return str.length();
    }
}
