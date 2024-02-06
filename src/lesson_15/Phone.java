package lesson_15;

/*
Марка, цена, диагональ экрана
делать фото, ставить будильник, играть музыку.
 */
public class Phone {
    String model;
    int price;
    double sizeScreen;


    // Конструктор
    public Phone(String phoneModel, int phonePrice, double phoneSize) {
        model = phoneModel;
        price = phonePrice;
        sizeScreen = phoneSize;
    }


    void makePhoto() {
        System.out.println("Делает фото");
    }

    void setAlarm() {
        System.out.println("Ставит будильник");
    }

    void playMusic () {
        System.out.println("Включает музыку");
    }


}
