package pl.edu.wszib.lab2.adapter;

import pl.edu.wszib.lab2.adapter.product.ProductService;
import pl.edu.wszib.lab2.adapter.toadapt.Order;
import pl.edu.wszib.lab2.adapter.toadapt.OrderItem;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderAdapter {
    private final OrderService orderService;
    private final ProductService productService;

    public OrderAdapter(OrderService orderService,
                        ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    public void handle(Order order) {
        pl.edu.wszib.lab2.adapter.Order adaptedOrder = adapt(order);
        orderService.handle(adaptedOrder);
    }

    private pl.edu.wszib.lab2.adapter.Order adapt(Order order) {
        return new pl.edu.wszib.lab2.adapter.Order(
                order.id.id,
                adapt(order.items)
        );
    }

    private List<pl.edu.wszib.lab2.adapter.OrderItem> adapt(Set<OrderItem> items) {
        return items.stream()
                .map(this::adapt)
                .collect(Collectors.toList());
    }

    private pl.edu.wszib.lab2.adapter.OrderItem adapt(OrderItem item) {
        String name = productService.getById(item.productId.id).name;
        return new pl.edu.wszib.lab2.adapter.OrderItem(
                item.productId.id,
                name,
                item.quantity,
                item.price
        );
    }
}
