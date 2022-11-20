package pl.edu.wszib.lab2.decorator;

public class DoubleTestOrderServiceDecorator implements OrderService {
    private final OrderService orderService;

    public DoubleTestOrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Integer handle(String name) {

        var result = orderService.handle(name);
        String _testName = "test";
        if(name.toLowerCase().contains(_testName.toLowerCase()))
            return result * 2;

        return name.length();
    }
}
