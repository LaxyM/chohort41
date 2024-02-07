package lesson_16;

public class RubberArray {
    int[] array;
    int cursor;

    // Конструктор
    public RubberArray() {
        array = new int[10];
    }

    //------------------------------Методы работающие в связке------------------------------------------


    //1.0 Метод принимает в массив одно значение и делает проверку на заполнение массива (до 90%)
    void add(int number) {
        if (cursor > array.length * 0.9) {
            expandArray();
        }
        array[cursor] = number;
        cursor++;
    }

    //1.1 Метод (перегрузка) с помощю которого мы можем добавлять
    // не ограниченное количество int-значений в массив.
    void add(int... ints) {
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    // 2.0 Метод добавляет массив x2 от изначального (10) при условии что предыдущий заполнен не 90%.
    // Переписывает все его значание в новый массив по новому адрессу в области хранения.
    // Был = array, будет = newArray
    void expandArray() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
    //------------------------------------------------------------------------------------------------------

    //Метод выводит на консоль содержимое массива что мы тут написали.
    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }




    // ---------------------------------Home Work-----------------------------------

    /// Метод ищет элемент в массиве и возвращает его индекс, если найден
    // и -1, если не найден
    int searchInt(int target) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Метод возвращает значение по указанному индексу
    int getValue(int index) {
        if (index >= 0 && index < cursor) {
            return array[index];
        } else {
            return -1;
        }
    }

    // Метод возвращает текущее количество элементов в массиве
    int getSize() {
        return cursor;
    }


}


