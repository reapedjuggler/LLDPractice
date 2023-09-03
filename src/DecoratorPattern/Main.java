package DecoratorPattern;

import DecoratorPattern.Toppings.ExtraCheeseTopping;
import DecoratorPattern.Toppings.MushroomTopping;

public class Main {
    public static void main(String[] args) {
        ExtraCheeseTopping farmhousePizzaWithExtraCheese = new ExtraCheeseTopping(new FarmhousePizza());
        FarmhousePizza farmhousePizza = new FarmhousePizza();
        System.out.println(farmhousePizzaWithExtraCheese.getCost() + " The cost of Farmhouse pizza with" +
                                                                        " extra cheese");
        System.out.println(farmhousePizza.getCost() + " The cost of a normal Farmhouse pizza");
        BasePizzaClass peppyPaneerWithExtraCheeseAndExtraMushroom = new MushroomTopping(new ExtraCheeseTopping(new PeppyPaneer()));
        System.out.println(peppyPaneerWithExtraCheeseAndExtraMushroom.getCost() + " The cost of customised peppy Paneer");
    }
}
