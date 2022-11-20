package pl.edu.wszib.lab2.decorator;

public class Application {

    public static void main(String[] args) {
        OrderService simpleOrderService = new SimpleOrderService();

        OrderService decoratedOrderService = new LogAroundOrderServiceDecorator(simpleOrderService);
        decoratedOrderService.handle("Test name");

        var testServiceDecorator = new TestOrderServiceDecorator(decoratedOrderService);
        var doubleTestOrderService = new DoubleTestOrderServiceDecorator(testServiceDecorator);
        OrderService decoratedDoubleTestOrderService = new LogAroundOrderServiceDecorator(doubleTestOrderService);
        decoratedDoubleTestOrderService.handle("atest");
    }
}
