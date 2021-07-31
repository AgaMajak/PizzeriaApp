package model;

import java.util.Objects;
import java.util.Set;

public class Pizza {
    private PizzaType type;
    private Set<Ingredient> ingredients;

    public Pizza(PizzaType type, Set<Ingredient> ingredients) {
        this.type = type;
        this.ingredients = ingredients;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Pizza " + type +
                " with ingredients:" + ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return type == pizza.type && Objects.equals(ingredients, pizza.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, ingredients);
    }
}
