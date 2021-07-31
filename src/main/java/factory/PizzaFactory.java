package factory;

import model.Ingredient;
import model.Pizza;
import model.PizzaType;

import java.util.HashSet;
import java.util.Set;

public class PizzaFactory {

    public static Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType.equals(PizzaType.MARGHERITA)) {
            return createMargherita();
        } else if (pizzaType.equals(PizzaType.CALZONE)) {
            return createCalzone();
        } else
            return createCapriciosa();
    }

    private static Pizza createMargherita() {
        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(new Ingredient("tomato sauce"));
        ingredients.add(new Ingredient("mozarella"));
        ingredients.add(new Ingredient("basil"));
        return new Pizza(PizzaType.MARGHERITA, ingredients);
    }

    private static Pizza createCapriciosa() {
        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(new Ingredient("tomato sauce"));
        ingredients.add(new Ingredient("mozarella"));
        ingredients.add(new Ingredient("basil"));
        ingredients.add(new Ingredient("ham"));
        ingredients.add(new Ingredient("mushrooms"));
        return new Pizza(PizzaType.CAPRICIOSA, ingredients);
    }

    private static Pizza createCalzone() {
        Set<Ingredient> ingredients = new HashSet<>();
        ingredients.add(new Ingredient("pepper sauce"));
        ingredients.add(new Ingredient("mozarella"));
        ingredients.add(new Ingredient("ham"));
        ingredients.add(new Ingredient("mushrooms"));
        return new Pizza(PizzaType.CALZONE, ingredients);
    }
}
