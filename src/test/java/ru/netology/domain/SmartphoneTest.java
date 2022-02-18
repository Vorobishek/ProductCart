package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void matchesName() {
        ProductRepository productRepository = new ProductRepository();

        Smartphone smartphone1 = new Smartphone(1, "Nokia", 389, "China");
        productRepository.save(smartphone1);

        boolean actual = smartphone1.matches("Nokia");

        assertTrue(actual);
    }

    @Test
    void matchesManufacturer() {
        ProductRepository productRepository = new ProductRepository();

        Smartphone smartphone1 = new Smartphone(1, "Nokia", 389, "China");
        productRepository.save(smartphone1);

        boolean actual = smartphone1.matches("China");

        assertTrue(actual);
    }

    @Test
    void matchesFalse() {
        ProductRepository productRepository = new ProductRepository();

        Smartphone smartphone1 = new Smartphone(1, "Nokia", 389, "China");
        productRepository.save(smartphone1);

        boolean actual = smartphone1.matches("Sony");

        assertFalse(actual);
    }
}