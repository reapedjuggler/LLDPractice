package StrategyDesignPattern.With;

import StrategyDesignPattern.With.Strategy.PassengerStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle () {
        super(new PassengerStrategy());
    }
}
