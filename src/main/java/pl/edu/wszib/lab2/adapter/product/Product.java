package pl.edu.wszib.lab2.adapter.product;

public class Product {
    public final String id;
    public final String name;
    public final String description;

    public Product(String id,
                   String name,
                   String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
