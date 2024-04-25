package com.library_managment;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {

//id (Benzersiz kitap kimliği)
//name(Kitap adı)
//publicationYear (Yayın yılı)
//stock (Kütüphanedeki miktarı)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id", columnDefinition = "serial")
    private int book_id;


    @Column(name = "book_name", nullable = false)
    private String book_name;


    @Column(name="book_publication_year",nullable = false)
    private int publicationYear;


    @Column(name="book_stock",nullable = false)
    private int stock;

    public Book() {
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
