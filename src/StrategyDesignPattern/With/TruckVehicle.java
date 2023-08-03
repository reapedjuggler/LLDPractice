package StrategyDesignPattern.With;

import StrategyDesignPattern.With.Strategy.GoodsVehicleStrategy;

public class TruckVehicle extends Vehicle{
    TruckVehicle () {
        super(new GoodsVehicleStrategy());
    }
}