package lesson_22.HomeWork;

public class Vehicle_Main {
    public static void main(String[] args) {
        // Массив тс!
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle();

        // Ззапуск движка у всех одновременно (полиморфизм)
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle currentVehicle = vehicles[i];
            currentVehicle.startEngine();
        }
    }
}