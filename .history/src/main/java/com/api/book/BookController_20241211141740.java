package com.api.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController{

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getBooks(){
        return this.bookService.getAllBooks();
    }
}


    //@GetMapping("/book")
    /*public ResponseEntity<List<Book>> getBooks(){
        List<Book> list = bookService.getAllBooks();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(list));
    }
}*/

    /*@GetMapping("/read/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

    @PostMapping("/write")
    public Book addBook(@RequestBody Book book){
        Book b = this.bookService.addBook(book);
        System.out.println(book);
        return b;
    }
    
    @DeleteMapping("/delete/{id}")
    public void delBook(@PathVariable("id") int id){
        this.bookService.delBook(id);
    }

    @PutMapping("/up/{id}")
    public Book upBook(@RequestBody Book book, @PathVariable("id") int id){
        this.bookService.upBook(book, id);
        return book;
    }

    }*/