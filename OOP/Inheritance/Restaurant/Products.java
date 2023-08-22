package OOP.Inheritance.Restaurant;

import java.math.BigDecimal;

public class Products {
    private String name;
    private BigDecimal price;

    public Products(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
