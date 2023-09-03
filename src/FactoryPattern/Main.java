package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        BeverageFactory beverageFactory = new BeverageFactory();
        Beverage myBeverage = beverageFactory.getYourDrink("Tea");
        myBeverage.drink();
        myBeverage = beverageFactory.getYourDrink("Coffee");
        myBeverage.drink();
    }
}
