package StrategyDesignPattern.With;
public class Main {
    // Remember "has A" is always preferred over "is A" relationship

    /**
     * Rule of Thumb: Composition over Inheritance
     */
    public static void main (String args[]) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new PassengerVehicle();
        vehicle.drive();
        vehicle = new TruckVehicle();
        vehicle.drive();
    }
}