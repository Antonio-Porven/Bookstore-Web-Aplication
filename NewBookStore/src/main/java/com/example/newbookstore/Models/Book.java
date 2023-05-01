package com.example.newbookstore.Models;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String author;
    @Column
    private String genre;
    @Column
    private Double price;
    @Column
    private String publisher;
    @Column
    private Double rating;
    @Column
    private String title;
    @Column
    private Integer unitsSold;
    @Column
    private Integer volume;
    @Column
    private String isbn;

    public Integer getId() {
        return id;
    }

    public Book setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Book setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Double getRating() {
        return rating;
    }

    public Book setRating(Double rating) {
        this.rating = rating;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Book setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Integer getUnitsSold() {
        return unitsSold;
    }

    public Book setUnitsSold(Integer unitsSold) {
        this.unitsSold = unitsSold;
        return this;
    }

    public Integer getVolume() {
        return volume;
    }

    public Book setVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }
}
