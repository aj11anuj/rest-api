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
    public Book addBook(Book b){
        Book result = bookRepo.save(b);
        return result;
    }

    public void delBook(int id){
        bookRepo
    }

    public void upBook(Book book, int id){
        list = list.stream().map(b->{
            if(b.getId()==id){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }

}