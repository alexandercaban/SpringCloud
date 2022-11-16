package com.scotiabank.book;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<Book> findAllBooks() {
        List<Book> books = new ArrayList();

        books.add(new Book(1,"Lo que el viento se llevo", "Margareth Michell"));
        books.add(new Book(2,"Dublineses", "James Joyce"));
        books.add(new Book(3,"El Bazar de los idiotas", "Gustavo Alvarez Gardeazabal"));

        return books;
    }

    @GetMapping("/{bookId}")
    public Book findBook(@PathVariable Long bookId) {
        return new Book(1,"Lo que el viento se llevo", "Margareth Michell");
	}

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return book;
    }

    @DeleteMapping("/{bookId}")
    public Long deleteBook(@PathVariable Long bookId) {
        return bookId;
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
        return book;
    }

    @PatchMapping("/{bookId}")
    public Book updateBook(@RequestBody Map<String, String> updates, @PathVariable Long bookId) {
        return new Book(1,"Lo que el viento se llevo", "Margareth Michell");
    }
}

