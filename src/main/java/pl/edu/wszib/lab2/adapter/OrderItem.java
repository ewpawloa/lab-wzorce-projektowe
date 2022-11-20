package pl.edu.wszib.lab2.adapter;

import java.math.BigDecimal;

public class OrderItem {
    public final String productId;
    public final String name;
    public final BigDecimal quantity;
    public final BigDecimal price;

    public OrderItem(String productId,
                     String name,
                     BigDecimal quantity,
                     BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
