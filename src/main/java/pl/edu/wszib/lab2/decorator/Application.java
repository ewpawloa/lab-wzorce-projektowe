package pl.edu.wszib.lab2.decorator;

public class Application {

    public static void main(String[] args) {
        OrderService simpleOrderService = new SimpleOrderService();
        Integer testName = simpleOrderService.handle("Test name");

        OrderService decoratedOrderService = new TestOrderServiceDecorator(new LogAroundOrderServiceDecorator(simpleOrderService));
        decoratedOrderService.handle("Test name");
    }
}
