package StrategyDesignPattern.With;

import StrategyDesignPattern.With.Strategy.GoodsVehicleStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle () {
        super(new GoodsVehicleStrategy());
    }
}
