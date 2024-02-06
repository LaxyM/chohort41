package lesson_15;

public class Phone_Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("iPhone", 1000, 6.5);
        Phone phone2 = new Phone("Samsung", 800, 6.2);
        Phone phone3 = new Phone("Xiaomi", 500, 6.0);

        // Выводим информацию о каждом телефоне
        System.out.println("Марка телефона: " + phone1.name + ", Цена: " + phone1.prise + ", Размер экрана: " + phone1.sizeScreen);
        System.out.println("Марка телефона: " + phone2.name + ", Цена: " + phone2.prise + ", Размер экрана: " + phone2.sizeScreen);
        System.out.println("Марка телефона: " + phone3.name + ", Цена: " + phone3.prise + ", Размер экрана: " + phone3.sizeScreen);


        phone1.playMusic();
        phone1.makePhoto();
        phone1.setAlarm();

    }

}
