
package com.api.book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Integer>{
    Optional<Book> book = bookRepo.findById(id);

    
}
