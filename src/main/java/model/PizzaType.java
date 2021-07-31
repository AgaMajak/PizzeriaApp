package model;

public enum PizzaType {
    MARGHERITA("Margherita: tomato sauce + mozarella + basil"),
    CAPRICIOSA("Capriciosa: tomato sauce + mozarella + basil + ham + mushrooms"),
    CALZONE("Calzone: pepper sauce + mozarella + ham + mushrooms (pizza is folded in half) ");

    private final String description;

    PizzaType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
