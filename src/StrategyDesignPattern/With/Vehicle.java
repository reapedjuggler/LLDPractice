package StrategyDesignPattern.With;

import StrategyDesignPattern.With.Strategy.DriveStrategy;
import StrategyDesignPattern.With.Strategy.GoodsVehicleStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle () {
        throw new NullPointerException("Drive Strategy can not be null");
    }
    Vehicle (DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive (){
        driveStrategy.drive();
    }
}
