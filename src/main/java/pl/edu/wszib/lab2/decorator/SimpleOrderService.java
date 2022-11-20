package pl.edu.wszib.lab2.decorator;

public class SimpleOrderService implements OrderService {
    @Override
    public Integer handle(String name) {
        return name.length();
    }
}
