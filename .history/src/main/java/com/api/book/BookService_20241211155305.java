package com.api.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class BookService{

    private static List<Book> list = new ArrayList<>();

    static{
        list.add(new Book(12, "Java Book", "abc"));
        list.add(new Book(13, "Dev_Book", "def"));
        list.add(new Book(14, "Java Book_of_maggy", "ghi"));
    }

    //getAllBooks
    public List<Book> getAllBooks(){
        return list;
    }

    //getBookById
    public Book getBookById(int id){
        Book book = null;
        book = list.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }

    //addBook
    public Book addBook(Book b){
        list.add(b);
        return b;
    }

    public void delBook(int id){
        list = list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
    }
}
/* 
    //addBook
    public Book addBook(Book b){
        list.add(b);
        return b;
    }

    //delBook
    public void delBook(int id){
        list = list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());
    }

    //upBook
    public void upBook(Book book, int id){
        list = list.stream().map(b->{
            if(b.getId()==id){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
            return b;
        }).collect(Collectors.toList());
    }
}*/