package factory;

import model.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class OrderFactoryTest {
    private User user = new User("Jan");
    private Set<Ingredient> ingredients = Set.of(new Ingredient("tomatoes"), new Ingredient("mozarella"));
    private List<Pizza> pizzas = List.of(new Pizza(PizzaType.CALZONE, ingredients));
    private Map<String, List<Pizza>> givenMap = new HashMap<>();

    @Test
    void shouldCheckIfKeyInMapIsUserName() {
        //given
        givenMap.put(user.getName(), pizzas);

        //when
        Order order = OrderFactory.createOrder(pizzas, user);
        Map<String, List<Pizza>> testedMap = order.getOrderMap();

        //then
        Assertions.assertThat(testedMap).containsKey(user.getName());

    }

    @Test
    void shouldCheckIfValueInMapIsPizzaList() {
        //given
        givenMap.put(user.getName(), pizzas);

        //when
        Order order = OrderFactory.createOrder(pizzas, user);
        Map<String, List<Pizza>> testedMap = order.getOrderMap();

        //then
        Assertions.assertThat(testedMap).containsValue(pizzas);

    }

    @Test
    void shouldCheckIfResultMapIsTheSameAsGiven() {
        //given
        givenMap.put(user.getName(), pizzas);

        //when
        Order order = OrderFactory.createOrder(pizzas, user);
        Map<String, List<Pizza>> testedMap = order.getOrderMap();

        //then
        Assertions.assertThat(testedMap).isEqualTo(givenMap);

    }
}