package lesson_40.HomeWork;

import java.util.function.BiConsumer;
/*
Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
 */
public class Task_3 {
    public static void main(String[] args) {
       BiConsumer<String,String> printKeyValue = (key, value) -> System.out.println(key + "=" + value);

        printKeyValue.accept("name", "Toni");
        printKeyValue.accept("age", "30");
    }
}
