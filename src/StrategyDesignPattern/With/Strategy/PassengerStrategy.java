package StrategyDesignPattern.With.Strategy;

// Remember "has A" is always preferred over "is A" relationship

/**
 * Rule of Thumb: Composition over Inheritance
 */
public class PassengerStrategy implements DriveStrategy {
    public void drive () {
        System.out.println("This is a Passenger Vehicle Strategy");
    }
}
