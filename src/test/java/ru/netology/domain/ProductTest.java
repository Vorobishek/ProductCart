package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void matchesTrue() {
        ProductRepository productRepository = new ProductRepository();

        Product product1 = new Product(1, "Piano", 356);
        productRepository.save(product1);

        boolean actual = product1.matches("Piano");

        assertTrue(actual);
    }

    @Test
    void matchesFalse() {
        ProductRepository productRepository = new ProductRepository();

        Product product1 = new Product(1, "Piano", 356);
        productRepository.save(product1);

        boolean actual = product1.matches("Drum");

        assertFalse(actual);
    }
}