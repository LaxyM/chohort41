package lesson_30.HomeWork;

public class SeasonInfo {
    private Season season;

    public SeasonInfo(Season season) {
        this.season = season;
    }

    public void printAvgTemp() {
        System.out.println("Средняя температура " + season.getName() + " составляет " + season.getAvgTemp() + "°C");
    }
}