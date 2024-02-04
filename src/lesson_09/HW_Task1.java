package lesson_09;

import java.util.Scanner;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for.

Пусть сумма вклада будет представлять тип float.

Введите сумму вклада: 100
Введите срок вклада в месяцах: 1
После 1 месяцев сумма вклада составит 107,00
 */

public class HW_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int months = scanner.nextInt();


        for (int i = 1; i <= months; i++) {
            deposit += deposit * 0.07F;
        }

        System.out.printf("После %d месяцев сумма вклада составит %.2f\n", months, deposit);
    }
}
