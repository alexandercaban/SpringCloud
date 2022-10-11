package com.scotiabank.rating;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Rating {
    private long id;
    private Long bookId;
    private int stars;
}
