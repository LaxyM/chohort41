package lesson_24.HomeWork.Task1;

class Triathlete implements Swimmer, Runner {
    @Override
    public void swim() {
        System.out.println("Triathlete swim.");
    }

    @Override
    public void run() {
        System.out.println("Triathlete run.");
    }
}