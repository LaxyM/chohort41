package lesson_19.Theory;

public class Train extends Vehicle{ // Обязательно должна быть связь IS-A (является)

    private int wagonCounter;
    public Train(String model, int yearManufactured, int wagonCounter) {
        super(model, yearManufactured);
        this.wagonCounter = wagonCounter;
    }

    public int getWagonCounter() {
        return wagonCounter;
    }

    public void setWagonCounter(int wagonCounter) {
        this.wagonCounter = wagonCounter;
    }
}
