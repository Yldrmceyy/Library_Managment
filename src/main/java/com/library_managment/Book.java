package com.library_managment;

import jakarta.persistence.*;

import javax.naming.Name;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private int book_id;


    @Column(name = "book_name", nullable = false)
    private String book_name;


    @Column(name = "book_publication_year", nullable = false)
    private int publicationYear;


    @Column(name = "book_stock", nullable = false)
    private int stock;


    @ManyToOne
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;


    @ManyToOne
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id ")
    private Publisher publisher;

    @OneToMany(mappedBy = "book")
    private List<BookBorrowing> borrowings;


    @ManyToMany
    @JoinTable(name = "book2category",
            joinColumns = {@JoinColumn(name = "book2category_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "book2category_category_id")})
    private List<Category> categories;

    public Book() {
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name(String siddhartha) {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getPublicationYear(int i) {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock(int i) {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
