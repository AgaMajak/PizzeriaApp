package io;

import model.Order;
import model.PizzaType;

import java.util.Set;
import java.util.stream.Stream;

public class AppPrinter {

    public static void printWelcoming() {
        AppPrinter.printText("Welcome in the Pizzeria Trattoria app!\n" + "Available pizzas:");
        Stream.of(PizzaType.values())
                .forEach((PizzaType pizzatype) -> System.out.println(pizzatype.getDescription()));
    }

    public static void printResumeAndGoodbye(Order order) {
        AppPrinter.printObjectToString(order);
        AppPrinter.printText("Thank you for your order.");
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printObjectToString(Object object) {
        System.out.println(object.toString());
    }

    public static <Ingredient> void printAllFromSet(Set<Ingredient> set) {
        set.forEach(System.out::println);
    }
}
