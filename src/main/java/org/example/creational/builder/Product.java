package org.example.creational.builder;


import java.util.List;

public class Product {

    private int id;
    private String name;
    private String description;
    private String color;

    private List<String> reviews;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", reviews=" + reviews +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }



    public static class Builder {

        Product product = new Product();

        public Builder id(int id) {
            product.id = id;
            return this;
        }

        public Builder name(String name) {
            product.name = name;
            return this;
        }

        public Builder description(String description) {
            product.description = description;
            return this;
        }


        public Builder color(String color) {
            product.color = color;
            return this;
        }

        public Builder reviews(List<String> reviews) {
            product.reviews = reviews;
            return this;
        }

        public Product build() {
            return product;
        }
    }

}
