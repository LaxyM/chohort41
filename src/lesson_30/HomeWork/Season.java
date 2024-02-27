package lesson_30.HomeWork;

public enum Season {
    WINTER("Зимой", -5),
    SPRING("Весной", 10),
    SUMMER("Летом", 30),
    AUTUMN("Осенью", 15);

    private String name;
    private int avgTemp;

    Season(String name, int avgTemp) {
        this.name = name;
        this.avgTemp = avgTemp;
    }

    public String getName() {
        return name;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}