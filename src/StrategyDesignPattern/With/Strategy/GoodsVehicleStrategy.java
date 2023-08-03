package StrategyDesignPattern.With.Strategy;

public class GoodsVehicleStrategy implements DriveStrategy{
    public void drive () {
        System.out.println("This is a Goods Vehicle Strategy");
    }
}
