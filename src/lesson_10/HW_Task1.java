package lesson_10;
/*
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени это Число
класс Math для нахождения степени числа использовать нельзя
 */

public class HW_Task1 {
    public static void main(String[] args) {
        int number = 30;
        fiveOfTwo(number);
    }

    public static void fiveOfTwo(int rate) {
        int result = 1;
        for (int i = 0; i < rate; i++) {
            result *= 2;
        }

        System.out.println("2 в степени " + rate + " равно: " + result);
    }
}

