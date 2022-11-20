package pl.edu.wszib.lab2.adapter.toadapt;

import java.util.Set;

public class Order {
    public final OrderId id;
    public final Set<OrderItem> items;

    public Order(OrderId id, Set<OrderItem> items) {
        this.id = id;
        this.items = items;
    }
}
