package lesson_16;

public class Theory1 {

    public static void main(String[] args) {

        Theory0 ra = new Theory0();

        System.out.println(ra.toString());

        ra.add(15);
        ra.add(-10);
        ra.add(100);

        for (int i = 0; i < 10; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }

        ra.add(100, 15, 17, -5, 24, -55, 15);

        System.out.println(ra);

    }
}
