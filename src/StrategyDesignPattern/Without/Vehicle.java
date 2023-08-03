package StrategyDesignPattern.Without;

// The base class
public class Vehicle {
    public void drive () {
        System.out.println("Driving a normal Vehicle");
    }
    public static void main (String args[]) {
        System.out.println("Inside main");
        Vehicle vehicle = new PassengerVehicle();
        vehicle.drive();
        /**
         These two strategies are redundant as Truck can easily use the same
         GoodsVehicle strategy
         Hence we need strategy design pattern;
         */
        vehicle = new GoodsVehicle();
        vehicle.drive();
        vehicle = new TruckVehicle();
        vehicle.drive();
    }
}
