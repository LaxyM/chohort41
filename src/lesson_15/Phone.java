package lesson_15;

/*
Марка, цена, диагональ экрана
делать фото, ставить будильник, играть музыку.
 */
public class Phone {
    String name;
    int prise;
    double sizeScreen;


    // Конструктор
    public Phone(String phoneName, int phonePrise, double phoneSize) {
        name = phoneName;
        prise = phonePrise;
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
