package DecoratorPattern.Toppings;
import DecoratorPattern.BasePizzaClass;
import DecoratorPattern.Toppings.ToppingsAbstract;

public class ExtraCheeseTopping extends ToppingsAbstract {
    // Constructor injection
    BasePizzaClass basePizzaClass = null;

    public ExtraCheeseTopping(BasePizzaClass basePizzaClass) {
        this.basePizzaClass = basePizzaClass;
    }

    public int getCost() {
        if (this.basePizzaClass == null) throw new NullPointerException("Pick your base pizza" +
                "first to continue");
        return this.basePizzaClass.getCost() + 20;
    }
}
