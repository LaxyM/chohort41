package lesson_11;

public class Theory_ReturnMetod {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;
        sumNumbers(x, y);

        int sum = sumNumbersWithReturn(x, y);
        System.out.println("sum: " + sum);

    }

    public static void sumNumbers(int i, int k) {
        int result = i + k;
        System.out.println(result);
    }

    public static int sumNumbersWithReturn(int i, int k) {
        int result = i + k;

        return result;

    }


}




