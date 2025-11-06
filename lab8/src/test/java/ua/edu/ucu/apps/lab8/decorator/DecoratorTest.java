package ua.edu.ucu.apps.lab8.decorator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import ua.edu.ucu.apps.lab8.model.Item;

class DecoratorTest {
    private Item baseItem;

    @BeforeEach
    void setUp() {
        baseItem = new Item() {
            {
                setDescription("Base Item");
            }
            
            @Override
            public double price() {
                return 100.0;
            }
        };
    }

    @Test
    void testRibbonDecorator() {
        Item decorated = new RibbonDecorator(baseItem);
        assertEquals(140.0, decorated.price(), 0.01);
        assertTrue(decorated.getDescription().contains("Ribbon"));
    }

    @Test
    void testBasketDecorator() {
        Item decorated = new BasketDecorator(baseItem);
        assertEquals(104.0, decorated.price(), 0.01);
        assertTrue(decorated.getDescription().contains("Basket"));
    }

    @Test
    void testPaperDecorator() {
        Item decorated = new PaperDecorator(baseItem);
        assertEquals(113.0, decorated.price(), 0.01);
        assertTrue(decorated.getDescription().contains("Paper"));
    }

    @Test
    void testMultipleDecorators() {
        Item decorated = new RibbonDecorator(
            new BasketDecorator(
                new PaperDecorator(baseItem)
            )
        );
        assertEquals(157.0, decorated.price(), 0.01);
        String desc = decorated.getDescription();
        assertTrue(desc.contains("Paper"));
        assertTrue(desc.contains("Basket"));
        assertTrue(desc.contains("Ribbon"));
    }
}