package lesson_07;
import java.util.Random;

        /*
        У ребенка есть карманные деньги. Допустим сейчас есть 100 денег.
        Ребенок получает  в школе оценки (от 1 до 5)
        За хорошие оценки получает деньги, за плохие отбирают:
        5 -> +20 денег
        4 -> +10
        3 -> не изменяется
        2 -> -20
        1 -> - все деньги

        вывести: У ребенка сейчас ххх денег
         */


public class Switch_While {
    public static void main(String[] args) {
        Random random = new Random();
        int note = random.nextInt(5) + 1; // Генерирует случайную оценку от 1 до 5
        int money = 100;
        System.out.println("Оценка: " + note);


        switch (note) {
            case 5:
                money += 20;
                break;
            case 4:
                money += 10;
                break;
            case 3:
                break;
            case 2:
                money -= 20;
                System.out.println("Плохой ребенок!");
                break;
            case 1:
                money = 0;
                System.out.println("Плохой ребенок!");
                break;
            default:
                System.out.println("Таких оценок не бывает");

        }
        System.out.println("У ребенка сейчас: " + money);



    }
}