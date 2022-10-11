package com.scotiabank.book;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {
    private long id;
    private String title;
    private String author;
}

