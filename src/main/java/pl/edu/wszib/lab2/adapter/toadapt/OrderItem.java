package pl.edu.wszib.lab2.adapter.toadapt;

import java.math.BigDecimal;

public class OrderItem {
    public final ProductId productId;
    public final BigDecimal quantity;
    public final BigDecimal price;

    public OrderItem(ProductId productId, BigDecimal quantity, BigDecimal price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
}
