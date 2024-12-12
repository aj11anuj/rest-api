package com.api.book;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book{

    @Id
    @Generated
    private int id;
    private String title;
    private String author;

    public Book() {
    }

    public Book(int id, String author, String title) {
        this.author = author;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{");
        sb.append("id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", author=").append(author);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}