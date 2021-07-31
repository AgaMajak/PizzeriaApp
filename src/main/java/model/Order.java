package model;

import java.util.List;
import java.util.Map;

public class Order {
    private Map<String, List<Pizza>> orderMap;

    public Order(Map<String, List<Pizza>> orderMap) {
        this.orderMap = orderMap;
    }

    public Map<String, List<Pizza>> getOrderMap() {
        return orderMap;
    }

    public void setOrderMap(Map<String, List<Pizza>> orderMap) {
        this.orderMap = orderMap;
    }

    @Override
    public String toString() {
        return orderMap.toString();
    }
}
