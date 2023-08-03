package StrategyDesignPattern.With;

public class Main {
    public static void main (String args[]) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new PassengerVehicle();
        vehicle.drive();
        vehicle = new TruckVehicle();
        vehicle.drive();
    }
}
