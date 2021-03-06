package com.codecool.rent_manager.model;

import lombok.Getter;
import lombok.Setter;

public class Product { // table: products
    protected @Getter @Setter int id;
    protected @Getter @Setter String name;
    protected @Getter @Setter int price;
    protected @Getter @Setter int category_id;
    protected @Getter @Setter int status_id;

    public Product(int id, String name, int price, int category_id, int status_id) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category_id = category_id;
        this.status_id = status_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category_id=" + category_id +
                ", status_id=" + status_id +
                '}';
    }
}
