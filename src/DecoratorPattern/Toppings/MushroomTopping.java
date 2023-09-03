package DecoratorPattern.Toppings;

import DecoratorPattern.BasePizzaClass;
import DecoratorPattern.Toppings.ToppingsAbstract;

public class MushroomTopping extends ToppingsAbstract {
    BasePizzaClass basePizza = null;
    public MushroomTopping (BasePizzaClass basePizzaClass) {
        this.basePizza = basePizzaClass;
    }
    @Override
    public int getCost() {
        if (this.basePizza == null) throw new NullPointerException("Pick your base pizza" +
                                                                    "first to continue");
        System.out.println(this.basePizza.getCost() + " The cost for pizza is ");
        return this.basePizza.getCost() + 20;
    }
}
