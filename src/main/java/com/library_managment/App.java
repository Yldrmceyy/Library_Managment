package com.library_managment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        // Create EntityManagerFactory and EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        // Adding an author
        Author author = new Author();
        author.setName("Hermann Karl Hesse");
        author.setCountry("Germany");
        author.setBirthDate(LocalDate.of(1877, Month.JULY, 2));
        entityManager.persist(author); // Persisting the author entity

        // Adding a publisher
        Publisher publisher = new Publisher();
        publisher.setName("Publisher Name");
        publisher.setEstablishmentYear(1950);
        publisher.setAddress("Publisher Address");
        entityManager.persist(publisher);

        // Adding a book
        Book book = new Book();
        book.setBook_name("Siddhartha");
        book.setPublicationYear(1922);
        book.setStock(150);
        book.setAuthor(author); // Correctly referencing the author
        book.setPublisher(publisher); // Associating the book with the publisher
        entityManager.persist(book);

        // Book borrowing
        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setName("Ceylan Yıldırım");
        bookBorrowing.setBorrowingDate(LocalDate.of(2024, Month.JULY, 2));
        bookBorrowing.setReturnDate(LocalDate.of(2024, Month.JULY, 12));
        bookBorrowing.setBook(book);
        entityManager.persist(bookBorrowing);

        // Adding a category
        Category category1 = new Category();
        category1.setCategory_name("Philosophical fiction");
        category1.setDescription("Philosophical fiction books explore topics like society, life's purpose, ethics, art, experience, and knowledge through storytelling.");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        category1.setBooks(bookList);
        entityManager.persist(category1);
        book.setCategories(Arrays.asList(category1)); // Adding the category to the book
        category1.setBooks(Arrays.asList(book)); // Adding the book to the category

        transaction.commit();
    }
}