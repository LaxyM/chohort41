package lesson_44;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReaderExample {
    public static void main(String[] args) {
        String dateTime = "15-12-2022 20-46";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");

        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, formatter);


        System.out.println("Дата и время: " + localDateTime);
        System.out.println("Месяц: " + localDateTime.getMonth());
        System.out.println("День: " + localDateTime.getDayOfMonth());
        System.out.println("Час: " + localDateTime.getHour());
    }

}
    