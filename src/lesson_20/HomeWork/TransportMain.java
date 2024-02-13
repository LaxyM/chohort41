package lesson_20.HomeWork;

public class TransportMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Телега", 1910);
        System.out.println(vehicle.toString());
        vehicle.go();
        vehicle.stop();

        System.out.println("\n ========================= \n");

        Bus bus = new Bus("Man", 2020, 3);
        System.out.println("bus.toString(): " + bus.toString());
        bus.go();
        bus.stop();

        System.out.println("bus.getCapacity(): " + bus.getCapacity());

        System.out.println(" \n ======================= \n");
        bus.getOutPassenger();
        bus.takePassenger();
        bus.takePassenger();
        bus.setCapacity(10);
        bus.takePassenger();


        System.out.println("bus.getCountPassengers(): " + bus.getCountPassengers());
        bus.takePassenger();
        bus.getOutPassenger();
        System.out.println("Общее количество перевезенных пассажиров : " + bus.getTotalPassengers());



    }
}


