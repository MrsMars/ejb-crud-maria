package com.aoher.model;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name = "Book.findOne", query = "select p from Book where p.id = :id"),
        @NamedQuery(name = "Book.getAll", query = "select p from Book p")
})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
