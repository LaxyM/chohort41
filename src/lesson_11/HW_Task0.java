package lesson_11;

public class HW_Task0 {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7};

        // Перегрузка для индекса
        inversion(array, 2);

        // Перегрузка для массива и флага
        inversion(array, true);
        inversion(array, false);
    }

    // Перегрузка для индекса
    public static void inversion(int[] arr, int index) {
        System.out.print("[");
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i]);
            if (i < index) {
                System.out.print(", ");
            }
        }

        for (int i = arr.length - 1; i > index; i--) {
            System.out.print(", " + arr[i]);
        }

        System.out.println("]");
    }



    // Перегрузка для массива и флага
    public static void inversion(int[] arr, boolean reverse) {
        System.out.print("[");

        if (reverse) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println("]");
    }
}



