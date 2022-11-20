package pl.edu.wszib.lab2.decorator;

public class Application {

    public static void main(String[] args) {
        OrderService simpleOrderService = new SimpleOrderService();
        Integer testName = simpleOrderService.handle("Test name");

        OrderService decoratedOrderService = new LogAroundOrderServiceDecorator(simpleOrderService);
        decoratedOrderService.handle("Test name");

        // TODO zad: utworzyć Decorator, który dla nazw zawierających słówko "test" podwaja zwracaną wartość
    }
}
