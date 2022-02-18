package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductManagerTest {

    private ProductRepository productRepository = new ProductRepository();
    private ProductManager manager = new ProductManager(productRepository);

    @Test
    void searchByFindFew() {

        Book book1 = new Book(12, "Sun", 25, "Coleman");
        manager.add(book1);
        Book book2 = new Book(13, "Play with the Sun", 25, "Parfenova");
        manager.add(book2);

        Smartphone smartphone1 = new Smartphone(14, "Nokia", 67, "Sun");
        manager.add(smartphone1);
        Smartphone smartphone2 = new Smartphone(15, "Sony", 89, "China");
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Sun");
        Product[] expected = new Product[]{book1, book2, smartphone1};

        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByFindNull() {

        Book book1 = new Book(12, "Sun", 25, "Coleman");
        manager.add(book1);
        Book book2 = new Book(13, "Play with the Sun", 25, "Parfenova");
        manager.add(book2);

        Smartphone smartphone1 = new Smartphone(14, "Nokia", 67, "Sun");
        manager.add(smartphone1);
        Smartphone smartphone2 = new Smartphone(15, "Sony", 89, "China");
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Mother");
        Product[] expected = new Product[0];

        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByFindOne() {

        Book book1 = new Book(12, "Sun", 25, "Coleman");
        manager.add(book1);
        Book book2 = new Book(13, "Play with the Sun", 25, "Parfenova");
        manager.add(book2);

        Smartphone smartphone1 = new Smartphone(14, "Nokia", 67, "Sun");
        manager.add(smartphone1);
        Smartphone smartphone2 = new Smartphone(15, "Sony", 89, "China");
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("China");
        Product[] expected = new Product[]{smartphone2};

        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByFindNullRepository() {

        Product[] actual = manager.searchBy("Sun");
        Product[] expected = new Product[0];

        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByFindInProduct() {

        Product product1 = new Product(12, "Toy", 25);
        manager.add(product1);
        Product product2 = new Product(22, "Toy2", 25);
        manager.add(product1);

        Product[] actual = manager.searchBy("Sun");
        Product[] expected = new Product[0];

        assertArrayEquals(expected, actual);

    }

}