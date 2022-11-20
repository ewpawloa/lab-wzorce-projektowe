package pl.edu.wszib.lab2.adapter.product;

public class ProductService {

    public Product getById(String productId) {
        // here we should probably call some http service
        return new Product(productId, "Testowy produkt", "Bardzo dobry testowy produkt");
    }
}
