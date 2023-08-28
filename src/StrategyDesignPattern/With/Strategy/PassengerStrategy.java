package StrategyDesignPattern.With.Strategy;
public class PassengerStrategy implements DriveStrategy{
    public void drive() {
        System.out.println("Driving a Passenger Vehicle");
    }
}