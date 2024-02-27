package lesson_30.HomeWork;

public class SeasonInfo_Main {
    public static void main(String[] args) {

        SeasonInfo winter = new SeasonInfo(Season.WINTER);
        SeasonInfo spring = new SeasonInfo(Season.SPRING);
        SeasonInfo summer = new SeasonInfo(Season.SUMMER);
        SeasonInfo autumn = new SeasonInfo(Season.AUTUMN);


        winter.printAvgTemp();
        spring.printAvgTemp();
        summer.printAvgTemp();
        autumn.printAvgTemp();
    }
}