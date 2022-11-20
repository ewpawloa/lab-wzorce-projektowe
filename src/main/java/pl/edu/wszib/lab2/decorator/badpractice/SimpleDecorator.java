package pl.edu.wszib.lab2.decorator.badpractice;

import pl.edu.wszib.lab2.decorator.OrderService;

public class SimpleDecorator implements Decorator {
    private OrderService orderService;
    @Override
    public void decorate(OrderService orderService) {
        this.orderService = orderService;   // we don't like setters
    }

    @Override
    public Integer handle(String name) {
        // real impl
        return null;
    }
}
