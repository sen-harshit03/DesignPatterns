package org.example.creational.builder.example1;

import org.example.creational.builder.Url;
import org.example.creational.builder.example1.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product.Builder()
                .id(1)
                .name("Book")
                .description("This is a book")
                .color("Red")
                .build();

//        System.out.println(product1);

        Product product2 = new Product.Builder()
                .id(2)
                .name("Book2")
                .description("This is a book2")
                .build();

//        System.out.println(product2);


        Product product3 = Product.builder()
                .id(3)
                .name("Toy")
                .color("Blue")
                .build();

        System.out.println(product3);


        Product product4 = Product.builder()
                .id(4)
                .name("Harry Potter")
                .reviews(List.of("Very Good book", "JK Rowling great author"))
                .build();

        System.out.println(product4);

        Url url = Url.builder()
                .protocol("https://")
                .hostname("localhost:")
                .port("8080")
                .pathParam("/api")
                .queryParam("?abc=ahdjg")
                .build();

        System.out.println(url);


    }
}
