package sorting.webshop;

import java.time.LocalDateTime;

public class Product {

    private String name;

    private int price;

    private LocalDateTime form;

    public Product(String name, int price, LocalDateTime form) {
        this.name = name;
        this.price = price;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDateTime getForm() {
        return form;
    }
}
