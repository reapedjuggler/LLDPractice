package StrategyDesignPattern.Without;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle () {
        System.out.println("Constructor of Passenger called");
    }
    @Override
    public void drive () {
        System.out.println("Driving a normal Vehicle");
    }
}
