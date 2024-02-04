package lesson_13;
/*
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
 */
public class HW_Task0 {
    public static String[] findStrings(String[] input) {
        if (input == null || input.length == 0) {
            return new String[0]; // Возвращаем пустой массив, если входной массив некорректен или пуст
        }

        String small = input[0];
        String big = input[0];

        for (String str : input) {
            if (str.length() < small.length()) {
                small = str;
            }
            if (str.length() > big.length()) {
                big = str;
            }
        }

        return new String[]{small, big};
    }

    public static void main(String[] args) {
        // Пример использования метода
        String[] inputArray = {"1", "ocean", "kiwis", "computer", "sunflower", "book", "cat"};
        String[] result = findStrings(inputArray);

        System.out.println("Shortest String: " + result[0]);
        System.out.println("Longest String: " + result[1]);
    }
}
