package lesson_16;

public class RubberArrayMain {
    public static void main(String[] args) {

        RubberArray ra = new RubberArray();

        System.out.println(ra.toString());

        ra.add(15);
        ra.add(-10);
        ra.add(100);

        for (int i = 0; i < 10; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }

        ra.add(100, 15, 17, -5, 24, -55, 15);

        System.out.println(ra.toString());


        // ---------------------------------Home Work-----------------------------------

        // Проверка метода searchInt
        int[] searchNumbers = {20, 24};
        for (int number : searchNumbers) {
            int index = ra.searchInt(number);
            if (index != -1) {
                System.out.println("Элемент " + number + " найден в массиве, его индекс: " + index);
            } else {
                System.out.println("Элемент " + number + " не найден в массиве.");
            }
        }

        // Проверка метода getValue
        int testIndex = 1;
        int valueAtIndex = ra.getValue(testIndex);
        System.out.println("Значение элемента с индексом " + testIndex + ": " + valueAtIndex);


        // Проверка метода getSize
        int currentSize = ra.getSize();
        System.out.println("Текущее количество элементов в массиве: "+currentSize);

    }


}



