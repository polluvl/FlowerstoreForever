package ua.edu.ucu.apps.lab8.decorator;

import ua.edu.ucu.apps.lab8.model.Item;

public class RibbonDecorator extends AbstractDecorator {
    private static final double RIBBON_PRICE = 40.0;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + RIBBON_PRICE;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Ribbon";
    }
}