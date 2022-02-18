package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void matchesName() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "Piano", 356, "Sazonov");
        productRepository.save(book1);

        boolean actual = book1.matches("Piano");

        assertTrue(actual);
    }

    @Test
    void matchesAuthor() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "Piano", 356, "Sazonov");
        productRepository.save(book1);

        boolean actual = book1.matches("Sazonov");

        assertTrue(actual);
    }

    @Test
    void matchesFalse() {
        ProductRepository productRepository = new ProductRepository();

        Book book1 = new Book(1, "Piano", 356, "Sazonov");
        productRepository.save(book1);

        boolean actual = book1.matches("Text");

        assertFalse(actual);
    }
}