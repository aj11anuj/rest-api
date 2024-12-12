
package com.api.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService{

    @Autowired
    private BookRepo bookRepo;

    //getAllBooks
    public List<Book> getAllBooks(){
        List<Book> list=(List<Book>)this.bookRepo.findAll();
        return list;
    }

    //getBookById
  / public Book getBookById(int id) {
        return bookRepo.findById(id).orElse(null);
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
        bookRepo.save(book);
    }

}
