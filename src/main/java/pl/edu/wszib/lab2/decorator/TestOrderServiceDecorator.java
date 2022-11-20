package pl.edu.wszib.lab2.decorator;

public class TestOrderServiceDecorator implements OrderService {
    private final OrderService orderService;

    public TestOrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Integer handle(String name) {
        return orderService.handle(name + "-TEST");
    }
}
