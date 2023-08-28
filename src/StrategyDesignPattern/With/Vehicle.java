package StrategyDesignPattern.With;

import StrategyDesignPattern.With.Strategy.DriveStrategy;

public class Vehicle{
    DriveStrategy driveStrategy;
    public Vehicle () {
        throw new NullPointerException("Can not drive without a drive strategy");
    }
    public Vehicle(DriveStrategy cstDriveStrategy) {
        driveStrategy = cstDriveStrategy;
    }
    public void drive () {
        driveStrategy.drive();
    }

}