package factory;

import model.Ingredient;
import model.Pizza;
import model.PizzaType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


class PizzaFactoryTest {
    private Pizza pizza = new Pizza(PizzaType.MARGHERITA, new HashSet<>(Set.of(new Ingredient("tomato sauce"), new Ingredient("basil"),
            new Ingredient("mozarella"))));


    @Test
    void shouldCheckIfCreatesRightPizza() {

        //when
        Pizza testedPizza = PizzaFactory.createPizza(PizzaType.MARGHERITA);

        //then
        Assertions.assertThat(testedPizza).isEqualTo(pizza);

    }
}