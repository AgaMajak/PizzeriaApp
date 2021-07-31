package factory;

import model.Order;
import model.Pizza;
import model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderFactory {

    public static Order createOrder(List<Pizza> pizzaList, User user) {
        Map<String, List<Pizza>> orderMap = new HashMap<>();
        orderMap.put(user.getName(), pizzaList);
        return new Order(orderMap);
    }
}

