package com.api.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class BookService{

    private BookRepo bookRepo;

    //getAllBooks
    public List<Book> getAllBooks(){
        List<Book> list=(List<Book>)this.bookRepo.findAll();
        return list;
    }

    //getBookById
    public Book getBookById(int id){
        Book book = null;
        try {
            this.bookRepo.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    //addBook
    public Book addBook(Book id){
        Book result = bookRepo.save(id);
        return result;
    }

    public void delBook(int id){
        bookRepo.deleteById(id);
    }

    public void upBook(Book book, int id){
        book.setId(id);
        bookRepo.save(book)
    }

}