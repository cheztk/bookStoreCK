package com.wecode.bookStoreCK.repository;

import com.wecode.bookStoreCK.model.Book;
import org.springframework.data.repository.CrudRepository;


import java.util.List;
import java.util.UUID;

public interface BookRepository extends CrudRepository<Book, UUID> {
        List<Book> findBookByTitle(String title);
        List<Book> findBooksByTitleIgnoreCase(String title);


}
