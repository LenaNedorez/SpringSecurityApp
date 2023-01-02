package com.example.MyBookShopApp.data.BookRate;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "book_rate")
@ApiModel(description = "entity of a book rate")
public class BookRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty("id generated by db automatically")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    @ApiModelProperty("id of the rated book")
    private Book book;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ApiModelProperty("id of the user, who rated the book")
    private User user;

    @Min(1)
    @Max(5)
    @ApiModelProperty("rate of a book")
    private Byte rate;

    public BookRate() {
    }

    public BookRate(Book book, User user, Byte rate) {
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

