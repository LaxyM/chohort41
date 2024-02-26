package lesson_29;

import java.util.Arrays;

public class MyLinked_Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(5);
        myList.add(7);
        myList.add(8);
        myList.add(9);


        System.out.println("Список после добавления элементов: " + myList);

        // Проверяем методы
        System.out.println("Размер списка: " + myList.size());
        System.out.println("Индекс первого вхождение элемента 5: " + myList.indexOf(5));
        System.out.println("Индекс последнее вхождение элемента 5: " + myList.lastIndexOf(5));
        System.out.println("Содержит ли список элемент со значением 6: " + myList.contains(6));
        System.out.println("Массив элементов списка: " + Arrays.toString(myList.toArray()));

        // Удаляем элементы
        myList.remove(3);
        System.out.println("Удаляем по индексу 3: " + myList);
        myList.remove((Integer) 8);
        System.out.println("Удаляем элемент 8: " + myList);
        myList.removeLast();
        System.out.println("Удаляем последний элемент: " + myList);

        // Выводим результаты после удалений
        System.out.println("Размер списка: " + myList.size());
        System.out.println("Массив элементов списка: " + Arrays.toString(myList.toArray()));

        // Получаем и устанавливаем элементы по индексу
        System.out.println("Элемент по индексу 2: " + myList.get(2));
        myList.set(2, 10);
        System.out.println("Список после установки элемента по индексу 2: " + myList);

    }
}
