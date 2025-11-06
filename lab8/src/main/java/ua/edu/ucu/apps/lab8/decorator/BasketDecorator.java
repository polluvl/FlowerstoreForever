package ua.edu.ucu.apps.lab8.decorator;

import ua.edu.ucu.apps.lab8.model.Item;

public class BasketDecorator extends AbstractDecorator {
    private static final double BASKET_PRICE = 4.0;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + BASKET_PRICE;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in Basket";
    }
}