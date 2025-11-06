package ua.edu.ucu.apps.lab8.decorator;

import ua.edu.ucu.apps.lab8.model.Item;

public class PaperDecorator extends AbstractDecorator {
    private static final double PAPER_PRICE = 13.0;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double price() {
        return super.price() + PAPER_PRICE;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " wrapped in Paper";
    }
}