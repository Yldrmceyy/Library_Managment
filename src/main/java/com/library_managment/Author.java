package com.library_managment;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name= "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id", columnDefinition = "serial")
    private long id;

    @Column(name="author_name", length = 100, nullable = false )
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name="author_birthday",nullable = false)
    private LocalDate birthDate;

    @Column(name="author_country",nullable = false)
    private String country;


    @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    private List<Book> books;


    public Author() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName(String aaa) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate(String s) {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBookList() {
        return books;
    }

    public void setBookList(List<Book> bookList) {
        this.books = bookList;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", country='" + country + '\'' +
                '}';
    }
}
