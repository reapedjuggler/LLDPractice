package StrategyDesignPattern.Without;

// The base class
public class Vehicle {
    public void drive () {
        System.out.println("Driving a normal Vehicle");
    }
    public static void main (String args[]) {
        System.out.println("Inside main");
        Vehicle vehicle = new PassengerVehicle();
    }
}
