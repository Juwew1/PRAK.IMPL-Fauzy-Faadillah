package Latihan_ISP;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- DEMO MOTOR ---");
        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine();
        myMotorcycle.drive();

        System.out.println("Motor tidak punya metode openDoors().");
        myMotorcycle.stop();
        myMotorcycle.refuel();
    }
}