package lesson_20.HomeWork;

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers; // по умолчанию установлено в 0
    private int totalPassengers; // общее количество перевезенных пассажиров

    public Bus(String model, int yearManufactured, int capacity) {
        super(model, yearManufactured);
        this.capacity = capacity;
    }

    public boolean takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            totalPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            return true;
        }

        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }

    public void getOutPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
        } else {
            System.out.println("Некому выходить - в автобусе больше нет пассажиров");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO надо проверять, есть ли "лишние" пассажиры в автобусе
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    // Сеттер для totalPassengers не нужен. Мы ничего в нем не меняем. Это скорее счетчик для инфы.
    public int getTotalPassengers() {
        return totalPassengers;
    }


}

