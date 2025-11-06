package ua.edu.ucu.apps.lab8.decorator;

import ua.edu.ucu.apps.lab8.model.Item;

public abstract class AbstractDecorator extends Item {
    private Item item;

    public AbstractDecorator(Item item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}