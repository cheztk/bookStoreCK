package com.wecode.bookStoreCK.repository;

import com.wecode.bookStoreCK.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.stream.StreamSupport;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BooRepositoryTest {

    @Autowired
    private BookRepository bookRepository;
    @Test
    @Sql(scripts = {"classpath:InsertInitialBookRecordForTest.sql"})
    void shouldAbleToFetchAllBooksInDB(){
        Iterable<Book> all = bookRepository.findAll();
        Long totalCount = StreamSupport.stream(all.spliterator(), false).count();
        Assertions.assertEquals(totalCount, 3);
    };

    @Test
    @Sql(scripts = {"classpath:InsertInitialBookRecordForTest.sql"})
    void shouldReturnOneBookWhenTitleEqualTestTitle(){
        List<Book> test_title = bookRepository.findBookByTitle("test title");
        Assertions.assertEquals(test_title.size(), 2);

    }
}
