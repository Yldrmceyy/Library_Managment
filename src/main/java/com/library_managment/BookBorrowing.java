package com.library_managment;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="book_borrowing")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="borrowing_id", columnDefinition = "serial")
    private long id;

    @Column(name="borrower_name", nullable = false)
    private String name;

    @Column(name="borrowing_date",nullable = false)
    private LocalDate borrowingDate;

    @Column(name="borrowing_return_date",nullable = false)
    private LocalDate returnDate;


    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="book_borrowing_id", referencedColumnName = "book_id")
    private Book book;


    public BookBorrowing() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

