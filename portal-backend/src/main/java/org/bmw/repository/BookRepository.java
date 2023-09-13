package org.bmw.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import org.bmw.model.Book;

import java.util.List;
@ApplicationScoped
public class BookRepository implements PanacheMongoRepository<Book> {

    public Book findByTitle(String title) {
        return find("title", title).firstResult();
    }

    public List<Book> findOrderedTitle() {
        return listAll(Sort.by("title"));
    }
}
