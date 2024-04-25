package com.library_managment;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="author_id", columnDefinition = "serial")
    private long id;

    @Column(name="author_name", length = 100, nullable = false )
    private String name;

    @Column(name="author_birthday",nullable = false)
    private LocalDate birthDate;

    @Column(name="author_country",nullable = false)
    private String country;

    public Author() {

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

    public LocalDate getBirthDate() {
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
