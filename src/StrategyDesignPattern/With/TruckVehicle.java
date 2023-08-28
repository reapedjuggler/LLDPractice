package StrategyDesignPattern.With;
import StrategyDesignPattern.With.Strategy.GoodsVehicleStrategy;
public class TruckVehicle extends Vehicle {
    public TruckVehicle () {
       super(new GoodsVehicleStrategy());
    }
}