package FactoryPattern;

public class BeverageFactory {
    // Now this is the single point of contact
    // from where we will give the inner object
    // I think this is a better way to achieve abstraction;
    BeverageFactory () {
        System.out.println("Initialised the Beverage Factory");
    }
    public Beverage getYourDrink (String input) {
        switch (input) {
            case "Coffee":
                return new Coffee();
            case "Tea":
                return new Tea();
            default:
                return null;
        }
    }
}
