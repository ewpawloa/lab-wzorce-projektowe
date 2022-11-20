package pl.edu.wszib.lab2.decorator.badpractice;

import pl.edu.wszib.lab2.decorator.OrderService;

public interface Decorator extends OrderService {
    void decorate(OrderService orderService);
}
