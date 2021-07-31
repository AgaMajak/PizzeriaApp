package controller;

import io.AppPrinter;
import io.AppReader;
import io.UserInput;
import model.Ingredient;
import model.Pizza;

import java.util.NoSuchElementException;
import java.util.Set;


public class IngredientModifier {

    private final String OPTION_ALTER = "alter";
    private final String OPTION_ADD = "add";
    private final String OPTION_DONE = "done";
    private final Set<Ingredient> FULL_INGREDIENT_SET = Set.of(
            new Ingredient("pepper sauce"), new Ingredient("tomato sauce"), new Ingredient("basil"),
            new Ingredient("mozarella"), new Ingredient("ham"), new Ingredient("mushrooms"),
            new Ingredient("salami"), new Ingredient("onion"), new Ingredient("olives"));
    private Pizza pizza;

    public IngredientModifier(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza returnPizzaWithModifiedIngredients() {
        boolean modifyIngredients = true;
        while (modifyIngredients) {
            String userChoice = UserInput.askUserWhatModificationsDoOnPizza();
            switch (userChoice) {
                case OPTION_ADD:
                    addIngredient();
                    break;
                case OPTION_ALTER:
                    alterIngredient();
                    break;
                case OPTION_DONE:
                    modifyIngredients = false;
                    break;
                default:
                    System.out.println("There is no such choice. Try again");
            }
        }
        return pizza;
    }

    private void alterIngredient() {
        Ingredient ingredient = returnChosenIngredient(pizza.getIngredients(), OPTION_ALTER);
        if (pizza.getIngredients().contains(ingredient)) {
            pizza.getIngredients().remove(ingredient);
            addIngredient();
        } else
            throw new NoSuchElementException();
    }

    private void addIngredient() {
        Ingredient newIngredient = returnChosenIngredient(FULL_INGREDIENT_SET, OPTION_ADD);
        if (FULL_INGREDIENT_SET.contains(newIngredient)) {
            pizza.getIngredients().add(newIngredient);
        } else
            throw new NoSuchElementException();
    }

    private Ingredient returnChosenIngredient(Set<Ingredient> setToPrint, String choice) {
        AppPrinter.printText("Choose ingredient to " + choice + ":");
        AppPrinter.printAllFromSet(setToPrint);
        return new Ingredient(AppReader.getStringAndLowerCase());
    }
}

