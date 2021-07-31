package controller;

import factory.OrderFactory;
import factory.PizzaFactory;
import factory.UserFactory;
import io.AppPrinter;
import io.AppReader;
import io.UserInput;
import model.Order;
import model.Pizza;
import model.PizzaType;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderCreator {

    public Order getOrder() {
        List<Pizza> pizzas = new ArrayList<>();
        PizzaType pizzaType;
        boolean nextPizza = true;
        AppPrinter.printWelcoming();
        do {
            try {
                AppPrinter.printText("Please write down what piza would you like to order:");
                pizzaType = getPizzaType();
                Pizza pizza = PizzaFactory.createPizza(pizzaType);
                Pizza checkedPizza = checkPizzaForModifying(pizza, UserInput.askUserAboutModifyingPizza());
                nextPizza = orderAnotherPizza(UserInput.askUserAboutOrderingAnotherPizza());
                pizzas.add(checkedPizza);
            } catch (NoSuchElementException e) {
                AppPrinter.printText("Something went wrong, try to order this pizza once again.");
            }
        } while (nextPizza);
        User user = UserFactory.createUser(UserInput.askUserForName());
        return OrderFactory.createOrder(pizzas, user);
    }

    private Pizza checkPizzaForModifying(Pizza pizza, String modifyPizzaChoice) {
        if (modifyPizzaChoice.equals("yes")) {
            IngredientModifier ingredientModifier = new IngredientModifier(pizza);
            return ingredientModifier.returnPizzaWithModifiedIngredients();
        } else if (modifyPizzaChoice.equals("no")) {
            return pizza;
        } else {
            throw new NoSuchElementException();
        }
    }

    private boolean orderAnotherPizza(String nextPizzaChoice) {
        if (nextPizzaChoice.equals("no")) {
            return false;
        } else if (nextPizzaChoice.equals("yes")) {
            return true;
        } else {
            throw new NoSuchElementException();
        }
    }

    PizzaType getPizzaType() {
        PizzaType pizzaType = null;
        boolean isPizzaTypeCorrect = false;
        while (!isPizzaTypeCorrect) {
            try {
                String userChoice = AppReader.getStringAndUpperCase();
                pizzaType = PizzaType.valueOf(userChoice);
                isPizzaTypeCorrect = true;
            } catch (IllegalArgumentException e) {
                AppPrinter.printText("There is no such pizza in the menu. Try again.");
            }
        }
        return pizzaType;
    }
}
