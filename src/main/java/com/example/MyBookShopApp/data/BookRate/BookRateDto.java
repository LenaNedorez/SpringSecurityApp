package com.example.MyBookShopApp.data.BookRate;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.User;

public class BookRateDto {

    private Integer id;

    private Book book;

    private User user;

    private Byte rate;

    public BookRateDto() {
    }

    public BookRateDto(Book book, User user, Byte rate) {
        this.book = book;
        this.user = user;
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Byte getRate() {
        return rate;
    }

    public void setRate(Byte rate) {
        this.rate = rate;
    }
}
